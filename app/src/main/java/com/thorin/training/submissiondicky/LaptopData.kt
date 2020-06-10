package com.thorin.training.submissiondicky

object LaptopData {
    private val laptopTypes = arrayOf("ASUS VivoBook E12 E203MAH",
    "ASUS VivoBook A407MA",
    "ASUS VivoBook Max X441MA",
    "Acer Aspire 3 A314-31",
    "Acer Aspire One D270-26C",
    "Acer Aspire V5-132",
    "Lenovo Thinkpad T420",
    "Lenovo IdeaPad C340 14",
    "HP Pavilion x360",
    "HP 1000-1431TU")

    private val laptopDetails = arrayOf("Laptop dengan ukuran layar 11.6 inci ini memiliki desain yang simple serta memiliki bobot yang ringan, sehingga sangat cocok untuk dibawa ke tempat kerja atau ke kampus. Soal spesifikasi, Asus yang satu ini dibekali dengan CPU Celeron Dual Core, dengan model prosesor Celeron N4000 yang memiliki kecepatan 1.1 GHz. Terdapat juga chipset Integrated Intel CPU yang pastinya cukup mumpuni untuk menyokong pekerjaan kamu.\n" +
            "Laptop ini tersedia dalam dua jenis RAM, yaitu 2 GB dan 4 GB. Jika kamu mencarinya di situs belanja online, kamu akan menemukan harga laptop ini mulai dari Rp2.750.000.",
  "A407MA juga memiliki desain yang stylish serta bobot yang ringan, hanya 1.5 kg saja. Urusan dapur pacu, laptop ini dibekali dengan Intel Celeron N4000 dan didukung dengan RAM 4 GB dan 8 GB. Kecepatan dari laptop ini bisa mencapai 2.6 GHz, dan kecepatan dari memorinya sendiri 2.400MHz. Dengan spesifikasi yang cukup mumpuni tersebut, VivoBook A407MA dijual dengan harga mulai dari Rp3.400.000.",
    "Masih dari Asus, laptop seri yang satu ini telah dilengkapi dengan Intel Pentium Silver N5000, dan ada juga yang menggunakan Intel Celeron N4000. Dengan layar berukuran 14 inci, laptop ini memiliki RAM sebesar 4 GB dan ROM 500 GB/ 1 TB. Laptop Asus ini dijual dengan harga mulai dari Rp3.500.000.",
    "Laptop murah selanjutnya datang dari Acer, dan telah menggunakan CPU Coleron Dual Core dengan prosesor model Intel Coleron N3350, dan didukung dengan RAM 4 GB. Hal yang cukup menarik dari laptop ini ialah daya baterainya yang tahan hingga 7 jam jika dipakai terus-menerus. Harganya juga cukup bersahabat, yaitu mulai dari Rp.3.650.000.",
    "Laptop selanjutnya dijual dengan harga mulai dari Rp4.000.000. Dengan harga sekian, kamu sudah bisa mendapat laptop yang dibekali prosesor Atom N2600 yang berkecepatan 1.6 GHz. Laptop ini juga mudah dibawa kemana-mana karena memiliki berat 1.3 kg saja.",
    "Hal yang diunggulkan dari Acer seri yang satu ini ialah prosesor Intel Dual Core generasi ketiga yang diklaim memiliki tingkat konsumsi daya yang rendah. Prosesor yang digunakan ialah Pentium 1019Y, dan baterainya juga awet dipakai terus-menerus hingga 5 jam pemakaian. Laptop ini di banderol dengan harga Rp4.920.000.",
    "Dengan harga jual mulai dari Rp3.700.000, laptop ini telah dibekali dengan CPU Core i3, i5 dan i7. Kecepatan dari prosesornya juga berbeda-beda, yaitu mulai dari 2.10 GHz. Tentu saja dengan harganya yang murah, laptop dengan spesifikasi mumpuni ini bisa menjadi pilihan kamu.",
    "Laptop ini memiliki ukuran layar 14 inci dan telah memiliki resolusi FHD, serta merupakan laptop dengan layar sentuh. IdeaPad C340 dibekali dengan prosesor Intel Core i7 generasi ke-8, Core i5, Core i3, dan juga tersedia yang menggunakan prosesor AMD. RAM yang dibekali juga berbeda-beda, mulai dari yang 4GB, 8GB, dan juga RAM 12GB. Laptop yang cukup gahar ini dijual dengan harga mulai dari Rp6.799.000.",
    "Laptop ini menggunakan CPU yang berbeda-beda, mulai Core i3, Core i5, Pentium, dan Pentium Quad Core. RAM yang digunakan sebesar 4 GB dan 8 GB, dengan penyimpanan HDD sebesar 500 GB dan 1 TB. Untuk harganya, laptop ini dijual dengan harga mulai dari Rp3.818.900.",
    "Laptop ini menggunakan prosesor model Core i3 3110M, dengan kecepatan 2.4 GHz. Dilengkapi juga dengan RAM 2 GB dengan penyimpanan jenis HDD berkapasitas 500 GB, serta memiliki kecepatan rotasi hingga 5.400rpm. Laptop ini dijual dengan harga mulai dari Rp4.699.000")

private val laptopImgaes = intArrayOf(R.drawable.asus_vivobooke12,
    R.drawable.asus_vivobook_a407,
    R.drawable.asus_vivobook_max,
    R.drawable.acer_aspire3,
    R.drawable.acer_aspireone,
    R.drawable.aceraspirev5,
    R.drawable.thinkpad_t40,
    R.drawable.ideapadc340,
    R.drawable.hp_pavilion,
    R.drawable.hp_1000
)

    val listData: ArrayList<Laptop>
    get() {
        val list = arrayListOf<Laptop>()
        for (position in laptopTypes.indices) {
            val laptop = Laptop()
            laptop.name = laptopTypes[position]
            laptop.detail = laptopDetails[position]
            laptop.photo = laptopImgaes[position]
            list.add(laptop)
        }
        return list
    }
}