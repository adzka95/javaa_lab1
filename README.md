# javaa_lab1
drzewo katalogow
Model odwzorowujący drzewo katalogów (rysunek poniżej) ma być tworzony w konstruktorze DiskFile, który jako argument otrzymuje obiekt java.nio.file.Path wskazujący korzeń drzewa. Pliki podrzędne trzymać w kolekcji (atrybut childFiles: Set<DiskFile>) w sposób uporządkowany.
Metodę DiskFile::size() zaimplementować w ten sposób, aby wywołana na katalogu zwracała liczbę znajdujących się w nim bezpośrednio plików.
Zamiast przestarzałej klasy java.io.File używać java.nio.file.Files. Do odczytania plików przechowywanych w katalogu użyj metody newDirectoryStream(Path dir).
Domyślny porządek dla DiskFile ustalić następująco: najpierw plik regularny potem katalog; pliki tego samego typu uporządkowane są niemalejąco pod względem rozmiaru (rozmiar zwraca metoda DiskFile::size()).

model pozwalający na wczytanie katalogu wraz z bezpośrednią zawartością a następnie listing katalogu zgodnie z domyślnym porządekiem dla DiskFile (1.5 pkt)
wyjaśnić dlaczego domyślny porządek jest zdefiniowany niepoprawnie dla postawionego zadania
model pozwalający na wczytanie katalogu rekurencyjnie a następnie listing jak na załączonym przykładzie (1.5 pkt)
komparator Comparator<DiskFile> przekazywany jako drugi argument konstruktora DiskFile, służący do ustalenia porządku plików podrzędnych trzymanych w childFiles : Set<DiskFile>) w następujący sposób:
SizeComparator: najpierw plik regularny potem katalog; pliki tego samego typu uporządkowane są niemalejąco pod względem rozmiaru a następnie nazwy (0,5 pkt)
NameLengthComparator: najpierw plik regularny potem katalog; pliki tego samego typu uporządkowane są niemalejąco pod względem długości nazwy a następnie nazwy (0,5 pkt)
serializacja i deserializacja obiektu DiskFile (1 pkt)model pozwalający na wczytanie katalogu wraz z bezpośrednią zawartością a następnie listing katalogu zgodnie z domyślnym porządekiem dla DiskFile (1.5 pkt)
wyjaśnić dlaczego domyślny porządek jest zdefiniowany niepoprawnie dla postawionego zadania
model pozwalający na wczytanie katalogu rekurencyjnie a następnie listing jak na załączonym przykładzie (1.5 pkt)
komparator Comparator<DiskFile> przekazywany jako drugi argument konstruktora DiskFile, służący do ustalenia porządku plików podrzędnych trzymanych w childFiles : Set<DiskFile>) w następujący sposób:
SizeComparator: najpierw plik regularny potem katalog; pliki tego samego typu uporządkowane są niemalejąco pod względem rozmiaru a następnie nazwy (0,5 pkt)
NameLengthComparator: najpierw plik regularny potem katalog; pliki tego samego typu uporządkowane są niemalejąco pod względem długości nazwy a następnie nazwy (0,5 pkt)
serializacja i deserializacja obiektu DiskFile (1 pkt)
