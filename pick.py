import os
import shutil
import re

nama_file_path = "data/nama.txt"
nim_file_path = "data/nim.txt"

source_folder = "raw"
destination_documents_folder = "result/document"
destination_archive_folder = "result/archive"

os.makedirs(destination_documents_folder, exist_ok=True)
os.makedirs(destination_archive_folder, exist_ok=True)

if not os.path.isfile(nama_file_path):
    print(f"File {nama_file_path} tidak ditemukan!")
    exit()

if not os.path.isfile(nim_file_path):
    print(f"File {nim_file_path} tidak ditemukan!")
    exit()

if not os.path.isdir(source_folder):
    print(f"Folder {source_folder} tidak ditemukan!")
    exit()

extensions_map = {
    "document": [".pdf", ".docx", ".doc"],
    "archive": [".zip", ".rar", ".7z", ".tar", ".gz", ".bz2"]
}

with open(nama_file_path, "r") as f:
    nama_list = [line.strip().upper() for line in f.readlines()]

with open(nim_file_path, "r") as f:
    nim_list = [line.strip() for line in f.readlines()]

def remove_extra_numbers(file_name):
    return re.sub(r"_[0-9]+", "", file_name)

nama_to_nim = {remove_extra_numbers(nama): nim for nama, nim in zip(nama_list, nim_list)}

def process_file(file_name, folder_name, folder_path):
    user_name = folder_name.rsplit("_", 2)[0].upper()
    user_name = remove_extra_numbers(user_name)
    nim = nama_to_nim.get(user_name, None)

    ext = os.path.splitext(file_name)[1].lower()
    if nim:
        new_file_name = f"{nim}_{user_name}{ext}"
    else:
        new_file_name = f"unknown_{user_name}{ext}"

    if ext in extensions_map["document"]:
        destination_path = os.path.join(destination_documents_folder, new_file_name)
    elif ext in extensions_map["archive"]:
        destination_path = os.path.join(destination_archive_folder, new_file_name)
    else:
        print(f"File dilewati (tidak didukung): {file_name}")
        return

    shutil.copy(os.path.join(folder_path, file_name), destination_path)
    print(f"File diproses: {file_name} -> {new_file_name}")

for folder_name in os.listdir(source_folder):
    folder_path = os.path.join(source_folder, folder_name)
    
    if os.path.isdir(folder_path) and folder_name.endswith("_file"):
        for file_name in os.listdir(folder_path):
            file_path = os.path.join(folder_path, file_name)
            
            if os.path.isfile(file_path):
                process_file(file_name, folder_name, folder_path)

print("Proses selesai.")