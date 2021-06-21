@file:Suppress("unused")

package `fun`.kotlingang.kstrings.builder

import `fun`.kotlingang.kstrings.LocalizedString


public class LocalizedStringBuilder(private val default: String) {
    private val variants = mutableMapOf<String, String>()

    public infix fun LanguageCode.translation(value: String) {
        variants[code] = value
    }

    public fun build(): LocalizedString = LocalizedString(default, variants)

    // Codegen part

    /**
     * Afrikaans
     */
    public val af: LanguageCode get() = LanguageCode(code = "af")
    /**
     * Arabic
     */
    public val ar: LanguageCode get() = LanguageCode(code = "ar")
    /**
     * Azeri
     */
    public val az: LanguageCode get() = LanguageCode(code = "az")
    /**
     * Belarusian
     */
    public val be: LanguageCode get() = LanguageCode(code = "be")
    /**
     * Bulgarian
     */
    public val bg: LanguageCode get() = LanguageCode(code = "bg")
    /**
     * Catalan
     */
    public val ca: LanguageCode get() = LanguageCode(code = "ca")
    /**
     * Czech
     */
    public val cs: LanguageCode get() = LanguageCode(code = "cs")
    /**
     * Welsh
     */
    public val cy: LanguageCode get() = LanguageCode(code = "cy")
    /**
     * Danish
     */
    public val da: LanguageCode get() = LanguageCode(code = "da")
    /**
     * German
     */
    public val de: LanguageCode get() = LanguageCode(code = "de")
    /**
     * Divehi
     */
    public val dv: LanguageCode get() = LanguageCode(code = "dv")
    /**
     * Greek
     */
    public val el: LanguageCode get() = LanguageCode(code = "el")
    /**
     * English
     */
    public val en: LanguageCode get() = LanguageCode(code = "en")
    /**
     * Esperanto
     */
    public val eo: LanguageCode get() = LanguageCode(code = "eo")
    /**
     * Spanish
     */
    public val es: LanguageCode get() = LanguageCode(code = "es")
    /**
     * Estonian
     */
    public val et: LanguageCode get() = LanguageCode(code = "et")
    /**
     * Basque
     */
    public val eu: LanguageCode get() = LanguageCode(code = "eu")
    /**
     * Farsi
     */
    public val fa: LanguageCode get() = LanguageCode(code = "fa")
    /**
     * Finnish
     */
    public val fi: LanguageCode get() = LanguageCode(code = "fi")
    /**
     * Faroese
     */
    public val fo: LanguageCode get() = LanguageCode(code = "fo")
    /**
     * French
     */
    public val fr: LanguageCode get() = LanguageCode(code = "fr")
    /**
     * Galician
     */
    public val gl: LanguageCode get() = LanguageCode(code = "gl")
    /**
     * Gujarati
     */
    public val gu: LanguageCode get() = LanguageCode(code = "gu")
    /**
     * Hebrew
     */
    public val he: LanguageCode get() = LanguageCode(code = "he")
    /**
     * Hindi
     */
    public val hi: LanguageCode get() = LanguageCode(code = "hi")
    /**
     * Croatian
     */
    public val hr: LanguageCode get() = LanguageCode(code = "hr")
    /**
     * Hungarian
     */
    public val hu: LanguageCode get() = LanguageCode(code = "hu")
    /**
     * Armenian
     */
    public val hy: LanguageCode get() = LanguageCode(code = "hy")
    /**
     * Indonesian
     */
    public val id: LanguageCode get() = LanguageCode(code = "id")
    /**
     * Icelandic
     */
    public val `is`: LanguageCode get() = LanguageCode(code = "is")
    /**
     * Italian
     */
    public val it: LanguageCode get() = LanguageCode(code = "it")
    /**
     * Japanese
     */
    public val ja: LanguageCode get() = LanguageCode(code = "ja")
    /**
     * Georgian
     */
    public val ka: LanguageCode get() = LanguageCode(code = "ka")
    /**
     * Kazakh
     */
    public val kk: LanguageCode get() = LanguageCode(code = "kk")
    /**
     * Kannada
     */
    public val kn: LanguageCode get() = LanguageCode(code = "kn")
    /**
     * Korean
     */
    public val ko: LanguageCode get() = LanguageCode(code = "ko")
    /**
     * Konkani
     */
    public val kok: LanguageCode get() = LanguageCode(code = "kok")
    /**
     * Kyrgyz
     */
    public val ky: LanguageCode get() = LanguageCode(code = "ky")
    /**
     * Lithuanian
     */
    public val lt: LanguageCode get() = LanguageCode(code = "lt")
    /**
     * Latvian
     */
    public val lv: LanguageCode get() = LanguageCode(code = "lv")
    /**
     * Maori
     */
    public val mi: LanguageCode get() = LanguageCode(code = "mi")
    /**
     * FYRO Macedonian
     */
    public val mk: LanguageCode get() = LanguageCode(code = "mk")
    /**
     * Mongolian
     */
    public val mn: LanguageCode get() = LanguageCode(code = "mn")
    /**
     * Marathi
     */
    public val mr: LanguageCode get() = LanguageCode(code = "mr")
    /**
     * Malay
     */
    public val ms: LanguageCode get() = LanguageCode(code = "ms")
    /**
     * Maltese
     */
    public val mt: LanguageCode get() = LanguageCode(code = "mt")
    /**
     * Norwegian (Bokm?l)
     */
    public val nb: LanguageCode get() = LanguageCode(code = "nb")
    /**
     * Dutch
     */
    public val nl: LanguageCode get() = LanguageCode(code = "nl")
    /**
     * Northern Sotho
     */
    public val ns: LanguageCode get() = LanguageCode(code = "ns")
    /**
     * Punjabi
     */
    public val pa: LanguageCode get() = LanguageCode(code = "pa")
    /**
     * Polish
     */
    public val pl: LanguageCode get() = LanguageCode(code = "pl")
    /**
     * Pashto
     */
    public val ps: LanguageCode get() = LanguageCode(code = "ps")
    /**
     * Portuguese
     */
    public val pt: LanguageCode get() = LanguageCode(code = "pt")
    /**
     * Quechua
     */
    public val qu: LanguageCode get() = LanguageCode(code = "qu")
    /**
     * Romanian
     */
    public val ro: LanguageCode get() = LanguageCode(code = "ro")
    /**
     * Russian
     */
    public val ru: LanguageCode get() = LanguageCode(code = "ru")
    /**
     * Sanskrit
     */
    public val sa: LanguageCode get() = LanguageCode(code = "sa")
    /**
     * Sami
     */
    public val se: LanguageCode get() = LanguageCode(code = "se")
    /**
     * Slovak
     */
    public val sk: LanguageCode get() = LanguageCode(code = "sk")
    /**
     * Slovenian
     */
    public val sl: LanguageCode get() = LanguageCode(code = "sl")
    /**
     * Albanian
     */
    public val sq: LanguageCode get() = LanguageCode(code = "sq")
    /**
     * Swedish
     */
    public val sv: LanguageCode get() = LanguageCode(code = "sv")
    /**
     * Swahili
     */
    public val sw: LanguageCode get() = LanguageCode(code = "sw")
    /**
     * Syriac
     */
    public val syr: LanguageCode get() = LanguageCode(code = "syr")
    /**
     * Tamil
     */
    public val ta: LanguageCode get() = LanguageCode(code = "ta")
    /**
     * Telugu
     */
    public val te: LanguageCode get() = LanguageCode(code = "te")
    /**
     * Thai
     */
    public val th: LanguageCode get() = LanguageCode(code = "th")
    /**
     * Tagalog
     */
    public val tl: LanguageCode get() = LanguageCode(code = "tl")
    /**
     * Tswana
     */
    public val tn: LanguageCode get() = LanguageCode(code = "tn")
    /**
     * Turkish
     */
    public val tr: LanguageCode get() = LanguageCode(code = "tr")
    /**
     * Tatar
     */
    public val tt: LanguageCode get() = LanguageCode(code = "tt")
    /**
     * Tsonga
     */
    public val ts: LanguageCode get() = LanguageCode(code = "ts")
    /**
     * Ukrainian
     */
    public val uk: LanguageCode get() = LanguageCode(code = "uk")
    /**
     * Urdu
     */
    public val ur: LanguageCode get() = LanguageCode(code = "ur")
    /**
     * Uzbek
     */
    public val uz: LanguageCode get() = LanguageCode(code = "uz")
    /**
     * Vietnamese
     */
    public val vi: LanguageCode get() = LanguageCode(code = "vi")
    /**
     * Xhosa
     */
    public val xh: LanguageCode get() = LanguageCode(code = "xh")
    /**
     * Chinese
     */
    public val zh: LanguageCode get() = LanguageCode(code = "zh")
    /**
     * Zulu
     */
    public val zu: LanguageCode get() = LanguageCode(code = "zu")
}
