package eu.kanade.tachiyomi.multisrc.mymangacms

import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

class MyMangaCMSGenerator : ThemeSourceGenerator {

    override val themePkg = "mymangacms"

    override val themeClass = "MyMangaCMS"

    override val baseVersionCode: Int = 2

    override val sources = listOf(
        SingleLang(
            "TruyenTranhLH",
            "https://truyentranhlh.net",
            "vi",
            isNsfw = true,
            overrideVersionCode = 10,
        ),
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MyMangaCMSGenerator().createAll()
        }
    }
}
