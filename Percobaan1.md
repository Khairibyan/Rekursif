Pertanyaan Percobaan 1
1. Apa yang dimaksud dengan fungsi rekursif?
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi
faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan
fungsi rekursif dan fungsi iteratif!

Jawaban :
1. fungsi yang memanggil dirinya sendiri untuk menyelesaikan suatu masalah. Pemanggilan tersebut akan terus dilakukan sampai mencapai kondisi tertentu yang disebut base case. Base case ini berfungsi sebagai batas agar proses tidak berjalan terus-menerus dan menyebabkan kesalahan pada program.

2. hasil yang diberikan oleh fungsi faktorialRekursif() dan faktorialIteratif() adalah sama, yaitu menghasilkan nilai faktorial yang benar untuk bilangan yang diberikan.

Perbedaannya terletak pada alur jalannya program. Fungsi rekursif bekerja dengan cara memanggil dirinya sendiri secara berulang hingga mencapai base case, kemudian hasilnya dikembalikan satu per satu. Proses ini menggunakan memori stack. Sedangkan fungsi iteratif menggunakan perulangan (loop) untuk menghitung faktorial tanpa pemanggilan fungsi berulang