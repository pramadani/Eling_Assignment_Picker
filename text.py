import os
import PyPDF2
from docx import Document

input_folder = 'result/document'
output_folder = 'result/text'

if not os.path.exists(output_folder):
    os.makedirs(output_folder)

if not os.path.exists(input_folder):
    print(f"Folder input '{input_folder}' tidak ditemukan!")
    exit()

def extract_text_from_pdf(pdf_path):
    with open(pdf_path, 'rb') as file:
        reader = PyPDF2.PdfReader(file)
        text = ''
        for page_num in range(len(reader.pages)):
            page = reader.pages[page_num]
            text += page.extract_text()
    return text

def extract_text_from_word(docx_path):
    doc = Document(docx_path)
    text = ''
    for para in doc.paragraphs:
        text += para.text + '\n'
    return text

if not any(os.path.isfile(os.path.join(input_folder, f)) for f in os.listdir(input_folder)):
    print(f"Tidak ada file di folder input '{input_folder}'")
    exit()

for filename in os.listdir(input_folder):
    file_path = os.path.join(input_folder, filename)
    txt_path = os.path.join(output_folder, f'{os.path.splitext(filename)[0]}.txt')

    if filename.endswith('.pdf'):
        if os.path.isfile(file_path):
            text = extract_text_from_pdf(file_path)
            with open(txt_path, 'w', encoding='utf-8') as txt_file:
                txt_file.write(text)
            print(f'File teks untuk {filename} (PDF) berhasil disimpan.')

    elif filename.endswith('.docx'):
        if os.path.isfile(file_path):
            text = extract_text_from_word(file_path)
            with open(txt_path, 'w', encoding='utf-8') as txt_file:
                txt_file.write(text)
            print(f'File teks untuk {filename} (Word) berhasil disimpan.')

print("Proses selesai.")
