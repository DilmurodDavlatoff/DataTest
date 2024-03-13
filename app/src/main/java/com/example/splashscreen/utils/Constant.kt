package com.example.splashscreen.utils

import com.example.splashscreen.model.Question

val categories = listOf<String>(
    "Frontend",//0
    "Backend",//1
    "Android",//2
    "Mobile Games",//3
    "Graphic Design",//4
    "SMM",//5
    "Mobilograhy",//6
    "Video Editing",//7
    "Architecture and Design",//8
    "Accounting",//9
    "Office Programs",//10

)

val questions = arrayListOf<Question>(

    Question(
        question = "Quyidagi sohalardan qaysi biri sizga eng qiziqarli ko'rinadi:",
        answers = arrayListOf(
           Answers(answer = "Dasturlash", category = arrayListOf(0,1,2,3)),

            Answers(answer = "Dizayn", category = arrayListOf(4,5,6,7)),

            Answers(answer = "Marketing", category = arrayListOf(5)),

            Answers(answer = "O'yinlar", category = arrayListOf(2,3)),

            Answers(answer = "Multimedia", category = arrayListOf(6,7))
        )

    ),
    Question(
        question = "Maktabda o'qiyotganingizda quyidagi fanlar siz uchun oson bo'lgan:",
        answers = arrayListOf(
            Answers(answer ="Chizmachilik, matematika", category = arrayListOf()),

            Answers(answer = "Informatika, matematika, fizika", category = arrayListOf() ),

            Answers(answer = "Chet tillarini o'rganish", category = arrayListOf() ),

            Answers(answer ="Informatika, Texnologiya" , category = arrayListOf(0,4) )
        )
    ),

    Question(
        question = "Sizga ko'proq nima yoqadi:",
        answers = arrayListOf(
            Answers(answer = "Muammolarni hal qilish, mantiqiy o'ylash, yechimlarni topish", category = arrayListOf(0,1,2) ),

            Answers(answer = "Tadqiqot o'tkazish, tahlil qilish, taktika tanlash", category = arrayListOf(9,10)),

            Answers(answer = "Yangi narsa o'ylab topish, tajriba o'tkazish, tasavvur qilish", category = arrayListOf(4,6,7,8) ),

            Answers(answer = "Kompyuter o'yinlarni o'ynash, texnoliyalarni o'rganish", category = arrayListOf(3)),

        )
    ),

    Question(
        question = "Bo'sh vaqtingizni nimaga sarflaysiz:",
        answers = arrayListOf(
            Answers(answer ="Shahar bo'ylab aylanish, yangi binolar arxitekturasini ko'rish" , category = arrayListOf(4,8)),

            Answers(answer ="Ilgari o'rganmagan yangi narsalarni o'rganish" , category = arrayListOf(1,3,4,8,9)),

            Answers(answer ="Rasm chizish, fotosessiya, kitobni o'qish, kinoni tomosha qilish" , category = arrayListOf(4,5,7)),

            Answers(answer ="Ijtimoiy tarmoqarda o'tirish, do'stlar bilan telefonda muloqot qilish" , category = arrayListOf(5)),

            Answers(answer ="Uyda dam olishga va ovqatni buyurtma berishga" , category = arrayListOf(4,5)),

        )
    ),

    Question(
        question = "Agar siz katta miqdordagi pulni to'plagan bo'lganingizda, uni nimaga sarflardingiz ?",
        answers = arrayListOf(
            Answers(answer = "Ish uchun yangi kompyuterga", category = arrayListOf(0,1,2)),

            Answers(answer = "Yangi kiyim va aksessuarlarga", category = arrayListOf(5,6)),

            Answers(answer = "Uyingizni zamonaviy ta'mirlashga", category = arrayListOf(4,8)),

            Answers(answer = "Oxirgi modeldagi telefonni yetkazib berish xizmatidan foydalanishga", category = arrayListOf(4,5,6,7)),

        )
    ),
    Question(
        question = "Sizga nima bilan ishlash oson:",
        answers = arrayListOf(
            Answers(answer = "Raqamlar va jadvallar bilan ", category = arrayListOf(9,10)),

            Answers(answer = "Odamlar bilan", category = arrayListOf(5,6)),

            Answers(answer = "Kompozitsiyadagi ranglarning kombinatsiyasi va tanlovi bilan", category = arrayListOf(4,8)),

            Answers(answer = "Kompyuter dasturlari bilan", category = arrayListOf(10,9)),
        )
    ),

    Question(
        question = "Siz uchun nima muhimroq:",
        answers = arrayListOf(
            Answers(answer = "Zamonaviy, istiqbolli kasbga ega bo'lish", category = arrayListOf(0,1,2,3)),

            Answers(answer = "Ijod bilan bog'liq qiziqarli ish", category = arrayListOf(6,7,8)),

            Answers(answer = "Mehnat bozorida mutaxassis sifatida doimiy talabga ega bo'lish", category = arrayListOf(0,9,10)),

            Answers(answer = "O'z qo'llaringiz bilan kelajakni qurish", category = arrayListOf(4,7))
        )
    ),

    Question(
        question = "Sizning kuchli tomonlaringiz:",
        answers = arrayListOf(
            Answers(answer = "Kuchli mantiq, har qanday vaziyatdan chiqish yo'li", category = arrayListOf(0,1,2,3)),

            Answers(answer = "Ijodkorlik, g'ayrioddiy fikrlash, kreativ o'ylash", category = arrayListOf(4,5,6)),

            Answers(answer = "Rivojlangan mantiq, tez o'rganish, muzokaralar olib borish qobiliyati", category = arrayListOf(9,10)),
        )
    ),

    Question(
        question = "Siz ko'proq:",
        answers = arrayListOf(
            Answers(answer = "«Ijodiy» odamsiz", category = arrayListOf(4,5,6,7)),

            Answers(answer = "«Mantiqli» odamsiz", category = arrayListOf(0,1,2,3)),

            Answers(answer = "«Qo'li usta» odamsiz", category = arrayListOf(8))
        )
    ),

    Question(
        question = "Sizga sovg'alar berilganda, nimaga ko'proq e'tibor berasiz:",
        answers = arrayListOf(
            Answers(answer = "Sovg'a va dizayn ko'rinishiga", category = arrayListOf(4,8)),
            Answers(answer = "Ichki tarkibiga", category = arrayListOf(0,1,2,3)),
            Answers(answer = "Ushbu sovg'adan qanday foydalanishga", category = arrayListOf(9,10))
        )
    ),

    Question(
        question = "Siz ma'lumotni qanday yaxshiroq qabul qilasiz va eslab qolasiz:",
        answers = arrayListOf(
            Answers(answer = "Rasmlar, tasvirlar va ranglardan foydalanganda", category = arrayListOf(4,6,7,8)),
            Answers(answer = "Yaxshiroq eslab qolish uchun mantiqni tushunishim kerak, uni aniqlab olishim kerak", category = arrayListOf(0,1,2)),
            Answers(answer = "Eshitish va daftarga vazifalarni yozib olish orqali va jadvallardagi hisobotlar yordamida", category = arrayListOf(9,10))
        )
    ),

    Question(
        question = "Siz yangi kompaniyaga ishga joylashdingiz va siz o'z xohishingizga ko'ra o'zingiz uchun vazifalarni tanlash imkoniyati berildi, siz:",
        answers = arrayListOf(
            Answers(answer = "Innovatsion g'oyalar, ijodiy ishni tanlayman", category = arrayListOf(4,8,6)),
            Answers(answer = "Texnik qismni tanlayman", category = arrayListOf(1,2)),
            Answers(answer = "Kompaniya reklamasini yurg'izishni tanlayman", category = arrayListOf(5)),
        )
    ),

    Question(
        question = "Yangi ishga kechikyapsiz, sizninig harakatlaringiz:",
        answers = arrayListOf(
            Answers(answer = "Vaqtimni hisoblashni boshlayman va o‘z vaqtida yetib borishga harakat qilaman", category = arrayListOf(0,1,2)),
            Answers(answer = "Google'dan eng yaqin marshrutni so'rayman", category = arrayListOf(2,3)),
            Answers(answer = "U yerga borish qanchalik qiyin bo'lganligi haqida hikoya tuzaman va  barcha tafsilotlarigacha aytib beraman", category = arrayListOf(4,5,6)),
            Answers(answer = "Men xotirjam bo'lib, sevimli shahrim manzarasidan bahramand bo'lib ketaman", category = arrayListOf(8)),
        )
    ),

    Question(
        question = "Siz yangi telefon sotib olmoqchisiz, harakatlaringiz:",
        answers = arrayListOf(
            Answers(answer = "Texnik xususiyatlarini diqqat bilan o'rganaman", category = arrayListOf(0,1,2,3)),
            Answers(answer = "Ushbu model bo'yicha video sharhlarni ko'raman", category = arrayListOf(9,10)),
            Answers(answer = "Ijtimoiy tarmoqlarga so'rovnoma joylayman", category = arrayListOf(5,6)),
            Answers(answer = "Eng chiroyli modelni tanliman", category = arrayListOf(4)),
        )
    ),

    Question(
        question = "Siz konsertga keldingiz, e'tiboringizni nima ko'proq jalb qiladi:",
        answers = arrayListOf(
            Answers(answer = "Kostyumlar, dekoratsiya, dizayn", category = arrayListOf(4,8)),
            Answers(answer = "Sahnaning texnik dizayni", category = arrayListOf(8,7)),
            Answers(answer = "Har xil effektlar", category = arrayListOf(6,7)),
            Answers(answer = "Atrofdagi odamlar", category = arrayListOf(5,1,2)),
        )
    )



)

