import os
import subprocess
import shutil
from pathlib import Path

def extract_with_7zip(archive_path, dest_folder):
    seven_zip_path = Path("C:/Program Files/7-Zip/7z.exe")
    if not seven_zip_path.exists():
        raise FileNotFoundError("7-Zip tidak ditemukan di lokasi yang ditentukan.")
    
    command = [str(seven_zip_path), "x", str(archive_path), f"-o{dest_folder}", "-y"]
    try:
        subprocess.run(command, check=True)
    except subprocess.CalledProcessError as e:
        raise RuntimeError(f"Error saat mengekstrak {archive_path}: {e}")

def move_java_files(src_folder, user_folder):
    src_folder = Path(src_folder)
    user_folder = Path(user_folder)
    for java_file in src_folder.rglob('*.java'):
        dest_file = user_folder / java_file.name
        try:
            shutil.move(str(java_file), str(dest_file))
            print(f"Memindahkan {java_file} ke {dest_file}")
        except Exception as e:
            print(f"Gagal memindahkan {java_file}: {e}")

def remove_readonly(func, path, exc_info):
    os.chmod(path, 0o777)
    func(path)

def extract_nested_archives(folder):
    for archive_file in folder.rglob('*'):
        if archive_file.suffix in ['.zip', '.rar', '.7z']:
            extract_folder = folder / archive_file.stem
            extract_folder.mkdir(parents=True, exist_ok=True)
            try:
                extract_with_7zip(archive_file, extract_folder)
                print(f"{archive_file} berhasil diekstrak ke {extract_folder}")
                archive_file.unlink()
                extract_nested_archives(extract_folder)
            except Exception as e:
                print(f"Error saat mengekstrak {archive_file}: {e}")

def process_archive(archive_name, archives_folder, code_temp_folder, final_code_folder):
    archive_extract_folder = code_temp_folder / archive_name.stem
    archive_extract_folder.mkdir(parents=True, exist_ok=True)

    try:
        extract_with_7zip(archive_name, archive_extract_folder)

        extract_nested_archives(archive_extract_folder)

        user_folder = final_code_folder / archive_name.stem
        user_folder.mkdir(parents=True, exist_ok=True)
        move_java_files(archive_extract_folder, user_folder)
    except Exception as e:
        print(f"Proses untuk {archive_name} gagal: {e}")
    finally:
        try:
            shutil.rmtree(archive_extract_folder, onerror=remove_readonly)
        except Exception as e:
            print(f"Gagal menghapus folder sementara {archive_extract_folder}: {e}")

result_folder = Path('result')
if not result_folder.exists():
    raise FileNotFoundError("Folder 'result' tidak ditemukan!")

archives_folder = result_folder / 'archive'
if not archives_folder.exists():
    raise FileNotFoundError(f"Folder 'archive' di dalam 'result' tidak ditemukan!")

code_temp_folder = result_folder / 'code_temp'
final_code_folder = result_folder / 'code'

final_code_folder.mkdir(parents=True, exist_ok=True)

if not any(archives_folder.iterdir()):
    print(f"Tidak ada file di folder '{archives_folder}'")
    exit()

for archive_name in archives_folder.iterdir():
    if archive_name.is_file():
        process_archive(archive_name, archives_folder, code_temp_folder, final_code_folder)

try:
    shutil.rmtree(code_temp_folder, onerror=remove_readonly)
except Exception as e:
    print(f"Gagal menghapus folder 'code_temp': {e}")

print("Proses selesai!")
