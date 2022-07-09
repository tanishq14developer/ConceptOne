package com.tanishq.sample

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.tanishq.sample.Model.Data

class DataProfiler {

    var gson: Gson = Gson()
    var string: String = "[\n" +
            "  {\n" +
            "    \"id\": 1662,\n" +
            "    \"count\": 8,\n" +
            "    \"name\": \"Tissues & Toilet Rolls\",\n" +
            "    \"type\": 2,\n" +
            "    \"slug\": \"tissues-toilet-rolls\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/tissues-toilet-rolls.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/tissues-toilet-rolls.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1670,\n" +
            "    \"count\": 11,\n" +
            "    \"name\": \"Baby Wipes\",\n" +
            "    \"type\": 5,\n" +
            "    \"slug\": \"baby-wipes\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/baby-wipes.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/baby-wipes.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1686,\n" +
            "    \"count\": 5,\n" +
            "    \"name\": \"Baby Gift Set\",\n" +
            "    \"type\": 5,\n" +
            "    \"slug\": \"baby-gift-set\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/baby-gift-set.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/baby-gift-set.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1764,\n" +
            "    \"count\": 64,\n" +
            "    \"name\": \"Fruits & Vegetables\",\n" +
            "    \"type\": 1,\n" +
            "    \"slug\": \"fruits-vegetables\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/fruits-vegetables.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/fruits-vegetables.svg\",\n" +
            "    \"child\": [\n" +
            "      {\n" +
            "        \"id\": 60,\n" +
            "        \"count\": 25,\n" +
            "        \"name\": \"Fresh Vegetables\",\n" +
            "        \"type\": 1,\n" +
            "        \"slug\": \"fresh-vegetables\",\n" +
            "        \"parent\": 1764,\n" +
            "        \"image\": \"https://media.homedrop.in/media/categories/new/sub-category/dummy-subcategory-image.webp\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 1756,\n" +
            "        \"count\": 5,\n" +
            "        \"name\": \"Fresh Fruits\",\n" +
            "        \"type\": 1,\n" +
            "        \"slug\": \"fresh-fruits\",\n" +
            "        \"parent\": 1764,\n" +
            "        \"image\": \"https://media.homedrop.in/media/categories/new/sub-category/dummy-subcategory-image.webp\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 190,\n" +
            "        \"count\": 34,\n" +
            "        \"name\": \"Dry Fruits\",\n" +
            "        \"type\": 1,\n" +
            "        \"slug\": \"dry-fruits\",\n" +
            "        \"parent\": 1764,\n" +
            "        \"image\": \"https://media.homedrop.in/media/categories/new/sub-category/dummy-subcategory-image.webp\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1767,\n" +
            "    \"count\": 5,\n" +
            "    \"name\": \"Glue, Tape & Scissor\",\n" +
            "    \"type\": 4,\n" +
            "    \"slug\": \"glue-tape-scissor\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/glue-tape-scissor.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/glue-tape-scissor.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1773,\n" +
            "    \"count\": 11,\n" +
            "    \"name\": \"Pen & Pencil\",\n" +
            "    \"type\": 4,\n" +
            "    \"slug\": \"pen-pencil\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/pen-pencil.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/pen-pencil.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1780,\n" +
            "    \"count\": 0,\n" +
            "    \"name\": \"Notebook, Files & Folder\",\n" +
            "    \"type\": 4,\n" +
            "    \"slug\": \"notebook-files-folder\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/notebook-files-folder.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/notebook-files-folder.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1805,\n" +
            "    \"count\": 4,\n" +
            "    \"name\": \"Colours & Crayons\",\n" +
            "    \"type\": 4,\n" +
            "    \"slug\": \"colours-crayons\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/colours-crayons.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/colours-caryons.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1815,\n" +
            "    \"count\": 5,\n" +
            "    \"name\": \"Office Stationery & Calculator\",\n" +
            "    \"type\": 4,\n" +
            "    \"slug\": \"office-stationery-calculator\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/office-stationery-calculator.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/office-stationery-calculator.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1817,\n" +
            "    \"count\": 1,\n" +
            "    \"name\": \"Exam Pad & Geometry Box\",\n" +
            "    \"type\": 4,\n" +
            "    \"slug\": \"exam-pad-geometry-box\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/exam-pad-geometry-box.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/exam-pad-geometry-box.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1826,\n" +
            "    \"count\": 1,\n" +
            "    \"name\": \"Eraser & Sharpener\",\n" +
            "    \"type\": 4,\n" +
            "    \"slug\": \"eraser-sharpener\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/eraser-sharpener.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/eraser-sharpener.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1895,\n" +
            "    \"count\": 3,\n" +
            "    \"name\": \"Baby Cream & Lotion\",\n" +
            "    \"type\": 5,\n" +
            "    \"slug\": \"baby-cream-lotion\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/baby-cream-lotion.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/baby-cream-lotion.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1898,\n" +
            "    \"count\": 7,\n" +
            "    \"name\": \"Baby Oil & Shampoo\",\n" +
            "    \"type\": 5,\n" +
            "    \"slug\": \"baby-oil-shampoo\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/baby-oil-shampoo.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/baby-oil-shampoo.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1910,\n" +
            "    \"count\": 6,\n" +
            "    \"name\": \"Baby Soap & Powder\",\n" +
            "    \"type\": 5,\n" +
            "    \"slug\": \"baby-soap-powder\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/baby-soap-powder.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/baby-soap-powder.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1912,\n" +
            "    \"count\": 4,\n" +
            "    \"name\": \"Feminine Hygiene\",\n" +
            "    \"type\": 2,\n" +
            "    \"slug\": \"feminine-hygiene\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/feminine-hygiene.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/feminine-hygiene.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 1944,\n" +
            "    \"count\": 7,\n" +
            "    \"name\": \"Air & Room Freshener\",\n" +
            "    \"type\": 3,\n" +
            "    \"slug\": \"air-room-freshener\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/air-room-freshener.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/air-room-freshener.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2081,\n" +
            "    \"count\": 14,\n" +
            "    \"name\": \"Men's Grooming\",\n" +
            "    \"type\": 2,\n" +
            "    \"slug\": \"mens-grooming\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/mens-grooming.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/mens-grooming.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2148,\n" +
            "    \"count\": 13,\n" +
            "    \"name\": \"Wipes & Mops\",\n" +
            "    \"type\": 3,\n" +
            "    \"slug\": \"wipes-mops\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/wipes-mops.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/wipes-mops.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2149,\n" +
            "    \"count\": 9,\n" +
            "    \"name\": \"Brushes & Scrubs\",\n" +
            "    \"type\": 3,\n" +
            "    \"slug\": \"brushes-scrubs\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/brushes-scrubs.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/brushes-scrubs.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2270,\n" +
            "    \"count\": 4,\n" +
            "    \"name\": \"Car & Shoe Care\",\n" +
            "    \"type\": 3,\n" +
            "    \"slug\": \"car-shoe-care\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/car-shoe-care.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/car-shoe-care.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2360,\n" +
            "    \"count\": 13,\n" +
            "    \"name\": \"Tools & Accessories\",\n" +
            "    \"type\": 2,\n" +
            "    \"slug\": \"tools-accessories\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/tools-accessories.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/tools-accessories.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2395,\n" +
            "    \"count\": 14,\n" +
            "    \"name\": \"Electronics & Electrical\",\n" +
            "    \"type\": 7,\n" +
            "    \"slug\": \"electronics-electrical\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/electronics-electrical.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/electronics-electrical.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2601,\n" +
            "    \"count\": 4,\n" +
            "    \"name\": \"Filter & Water Bottle\",\n" +
            "    \"type\": 3,\n" +
            "    \"slug\": \"filter-water-bottle\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/filter-water-bottle.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/filter-water-bottle.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2606,\n" +
            "    \"count\": 2,\n" +
            "    \"name\": \"Bathroom Accessories\",\n" +
            "    \"type\": 3,\n" +
            "    \"slug\": \"bathroom-accessories\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/bathroom-accessories.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/bathroom-accessories.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2642,\n" +
            "    \"count\": 3,\n" +
            "    \"name\": \"Tiffin\",\n" +
            "    \"type\": 3,\n" +
            "    \"slug\": \"tiffin\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/tiffin.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/tiffin.svg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2647,\n" +
            "    \"count\": 2,\n" +
            "    \"name\": \"Containers\",\n" +
            "    \"type\": 3,\n" +
            "    \"slug\": \"containers\",\n" +
            "    \"parent\": 0,\n" +
            "    \"image\": \"https://media.homedrop.in/media/categories/new/containers.webp\",\n" +
            "    \"icon\": \"https://media.homedrop.in/media/categories/containers.svg\"\n" +
            "  }\n" +
            "]"



    fun getCategory():List<Data> {
        val myType = object : TypeToken<List<Data>>() {}.type
        val logs = gson.fromJson<List<Data>>(string, myType)
        return logs

    }















}
