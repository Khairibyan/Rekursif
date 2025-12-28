Pertanyaan Percobaan 3 
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case”
dan “recursion call”!
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika
diberikan nilai hitungLaba(100000,3)

Jawaban :
1. Blok kode yang merupakan base case dan recursion call

Base case terdapat pada kondisi:
if (tahun == 0) { return saldo; }
Bagian ini menjadi titik berhenti rekursi. Saat tahun bernilai 0, fungsi tidak memanggil dirinya lagi dan langsung mengembalikan nilai saldo.

Recursion call terdapat pada bagian:
return 1.11 * hitungLaba(saldo, tahun - 1);
Baris ini memanggil kembali fungsi hitungLaba dengan nilai tahun dikurangi 1 untuk menghitung saldo tahun sebelumnya.

2. Trace fase ekspansi dan fase substitusi untuk hitungLaba(100000, 3)
Fase ekspansi (pemanggilan berulang):

hitungLaba(100000, 3)
→ 1.11 × hitungLaba(100000, 2)
hitungLaba(100000, 2)
→ 1.11 × hitungLaba(100000, 1)
hitungLaba(100000, 1)
→ 1.11 × hitungLaba(100000, 0)

hitungLaba(100000, 0)
→ return 100000

Fase substitusi (pengembalian nilai):
hitungLaba(100000, 0) = 100000
hitungLaba(100000, 1) = 1.11 × 100000 = 111000
hitungLaba(100000, 2) = 1.11 × 111000 = 123210
hitungLaba(100000, 3) = 1.11 × 123210 = 136753.1
Hasil akhir:
Saldo setelah 3 tahun = 136753.1
