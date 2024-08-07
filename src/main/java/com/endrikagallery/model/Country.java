/**
 * Copyright (c) 2024 Nabil Andriantomanga
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.endrikagallery.model;

import com.endrikagallery.utils.StringUtil;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Nabil Andriantomanga
 * @version 1.0
 * @since 2024
 */
public enum Country {
    AFGHANISTAN("Afghanistan", "AF"),
    ALBANIA("Albania", "AL"),
    ALGERIA("Algeria", "DZ"),
    ANDORRA("Andorra", "AD"),
    ANGOLA("Angola", "AO"),
    ANTIGUA_AND_BARBUDA("Antigua and Barbuda", "AG"),
    ARGENTINA("Argentina", "AR"),
    ARMENIA("Armenia", "AM"),
    AUSTRALIA("Australia", "AU"),
    AUSTRIA("Austria", "AT"),
    AZERBAIJAN("Azerbaijan", "AZ"),
    BAHAMAS("Bahamas", "BS"),
    BAHRAIN("Bahrain", "BH"),
    BANGLADESH("Bangladesh", "BD"),
    BARBADOS("Barbados", "BB"),
    BELARUS("Belarus", "BY"),
    BELGIUM("Belgium", "BE"),
    BELIZE("Belize", "BZ"),
    BENIN("Benin", "BJ"),
    BHUTAN("Bhutan", "BT"),
    BOLIVIA("Bolivia", "BO"),
    BOSNIA_AND_HERZEGOVINA("Bosnia and Herzegovina", "BA"),
    BOTSWANA("Botswana", "BW"),
    BRAZIL("Brazil", "BR"),
    BRUNEI("Brunei", "BN"),
    BULGARIA("Bulgaria", "BG"),
    BURKINA_FASO("Burkina Faso", "BF"),
    BURUNDI("Burundi", "BI"),
    CABO_VERDE("Cabo Verde", "CV"),
    CAMBODIA("Cambodia", "KH"),
    CAMEROON("Cameroon", "CM"),
    CANADA("Canada", "CA"),
    CENTRAL_AFRICAN_REPUBLIC("Central African Republic", "CF"),
    CHAD("Chad", "TD"),
    CHILE("Chile", "CL"),
    CHINA("China", "CN"),
    COLOMBIA("Colombia", "CO"),
    COMOROS("Comoros", "KM"),
    CONGO("Congo", "CG"),
    COSTA_RICA("Costa Rica", "CR"),
    CROATIA("Croatia", "HR"),
    CUBA("Cuba", "CU"),
    CYPRUS("Cyprus", "CY"),
    CZECH_REPUBLIC("Czech Republic", "CZ"),
    DENMARK("Denmark", "DK"),
    DJIBOUTI("Djibouti", "DJ"),
    DOMINICA("Dominica", "DM"),
    DOMINICAN_REPUBLIC("Dominican Republic", "DO"),
    ECUADOR("Ecuador", "EC"),
    EGYPT("Egypt", "EG"),
    EL_SALVADOR("El Salvador", "SV"),
    EQUATORIAL_GUINEA("Equatorial Guinea", "GQ"),
    ERITREA("Eritrea", "ER"),
    ESTONIA("Estonia", "EE"),
    ESWATINI("Eswatini", "SZ"),
    ETHIOPIA("Ethiopia", "ET"),
    FIJI("Fiji", "FJ"),
    FINLAND("Finland", "FI"),
    FRANCE("France", "FR"),
    GABON("Gabon", "GA"),
    GAMBIA("Gambia", "GM"),
    GEORGIA("Georgia", "GE"),
    GERMANY("Germany", "DE"),
    GHANA("Ghana", "GH"),
    GREECE("Greece", "GR"),
    GRENADA("Grenada", "GD"),
    GUATEMALA("Guatemala", "GT"),
    GUINEA("Guinea", "GN"),
    GUINEA_BISSAU("Guinea-Bissau", "GW"),
    GUYANA("Guyana", "GY"),
    HAITI("Haiti", "HT"),
    HONDURAS("Honduras", "HN"),
    HUNGARY("Hungary", "HU"),
    ICELAND("Iceland", "IS"),
    INDIA("India", "IN"),
    INDONESIA("Indonesia", "ID"),
    IRAN("Iran", "IR"),
    IRAQ("Iraq", "IQ"),
    IRELAND("Ireland", "IE"),
    ISRAEL("Israel", "IL"),
    ITALY("Italy", "IT"),
    JAMAICA("Jamaica", "JM"),
    JAPAN("Japan", "JP"),
    JORDAN("Jordan", "JO"),
    KAZAKHSTAN("Kazakhstan", "KZ"),
    KENYA("Kenya", "KE"),
    KIRIBATI("Kiribati", "KI"),
    KOREA_NORTH("North Korea", "KP"),
    KOREA_SOUTH("South Korea", "KR"),
    KUWAIT("Kuwait", "KW"),
    KYRGYZSTAN("Kyrgyzstan", "KG"),
    LAOS("Laos", "LA"),
    LATVIA("Latvia", "LV"),
    LEBANON("Lebanon", "LB"),
    LESOTHO("Lesotho", "LS"),
    LIBERIA("Liberia", "LR"),
    LIBYA("Libya", "LY"),
    LIECHTENSTEIN("Liechtenstein", "LI"),
    LITHUANIA("Lithuania", "LT"),
    LUXEMBOURG("Luxembourg", "LU"),
    MADAGASCAR("Madagascar", "MG"),
    MALAWI("Malawi", "MW"),
    MALAYSIA("Malaysia", "MY"),
    MALDIVES("Maldives", "MV"),
    MALI("Mali", "ML"),
    MALTA("Malta", "MT"),
    MARSHALL_ISLANDS("Marshall Islands", "MH"),
    MAURITANIA("Mauritania", "MR"),
    MAURITIUS("Mauritius", "MU"),
    MEXICO("Mexico", "MX"),
    MICRONESIA("Micronesia", "FM"),
    MOLDOVA("Moldova", "MD"),
    MONACO("Monaco", "MC"),
    MONGOLIA("Mongolia", "MN"),
    MONTENEGRO("Montenegro", "ME"),
    MOROCCO("Morocco", "MA"),
    MOZAMBIQUE("Mozambique", "MZ"),
    MYANMAR("Myanmar", "MM"),
    NAMIBIA("Namibia", "NA"),
    NAURU("Nauru", "NR"),
    NEPAL("Nepal", "NP"),
    NETHERLANDS("Netherlands", "NL"),
    NEW_ZEALAND("New Zealand", "NZ"),
    NICARAGUA("Nicaragua", "NI"),
    NIGER("Niger", "NE"),
    NIGERIA("Nigeria", "NG"),
    NORTH_MACEDONIA("North Macedonia", "MK"),
    NORWAY("Norway", "NO"),
    OMAN("Oman", "OM"),
    PAKISTAN("Pakistan", "PK"),
    PALAU("Palau", "PW"),
    PALESTINE("Palestine", "PS"),
    PANAMA("Panama", "PA"),
    PAPUA_NEW_GUINEA("Papua New Guinea", "PG"),
    PARAGUAY("Paraguay", "PY"),
    PERU("Peru", "PE"),
    PHILIPPINES("Philippines", "PH"),
    POLAND("Poland", "PL"),
    PORTUGAL("Portugal", "PT"),
    QATAR("Qatar", "QA"),
    ROMANIA("Romania", "RO"),
    RUSSIA("Russia", "RU"),
    RWANDA("Rwanda", "RW"),
    SAINT_KITTS_AND_NEVIS("Saint Kitts and Nevis", "KN"),
    SAINT_LUCIA("Saint Lucia", "LC"),
    SAINT_VINCENT_AND_THE_GRENADINES("Saint Vincent and the Grenadines", "VC"),
    SAMOA("Samoa", "WS"),
    SAN_MARINO("San Marino", "SM"),
    SAO_TOME_AND_PRINCIPE("Sao Tome and Principe", "ST"),
    SAUDI_ARABIA("Saudi Arabia", "SA"),
    SENEGAL("Senegal", "SN"),
    SERBIA("Serbia", "RS"),
    SEYCHELLES("Seychelles", "SC"),
    SIERRA_LEONE("Sierra Leone", "SL"),
    SINGAPORE("Singapore", "SG"),
    SLOVAKIA("Slovakia", "SK"),
    SLOVENIA("Slovenia", "SI"),
    SOLOMON_ISLANDS("Solomon Islands", "SB"),
    SOMALIA("Somalia", "SO"),
    SOUTH_AFRICA("South Africa", "ZA"),
    SOUTH_SUDAN("South Sudan", "SS"),
    SPAIN("Spain", "ES"),
    SRI_LANKA("Sri Lanka", "LK"),
    SUDAN("Sudan", "SD"),
    SURINAME("Suriname", "SR"),
    SWEDEN("Sweden", "SE"),
    SWITZERLAND("Switzerland", "CH"),
    SYRIA("Syria", "SY"),
    TAIWAN("Taiwan", "TW"),
    TAJIKISTAN("Tajikistan", "TJ"),
    TANZANIA("Tanzania", "TZ"),
    THAILAND("Thailand", "TH"),
    TIMOR_LESTE("Timor-Leste", "TL"),
    TOGO("Togo", "TG"),
    TONGA("Tonga", "TO"),
    TRINIDAD_AND_TOBAGO("Trinidad and Tobago", "TT"),
    TUNISIA("Tunisia", "TN"),
    TURKEY("Turkey", "TR"),
    TURKMENISTAN("Turkmenistan", "TM"),
    TUVALU("Tuvalu", "TV"),
    UGANDA("Uganda", "UG"),
    UKRAINE("Ukraine", "UA"),
    UNITED_ARAB_EMIRATES("United Arab Emirates", "AE"),
    UNITED_KINGDOM("United Kingdom", "GB"),
    UNITED_STATES("United States", "US"),
    URUGUAY("Uruguay", "UY"),
    UZBEKISTAN("Uzbekistan", "UZ"),
    VANUATU("Vanuatu", "VU"),
    VATICAN_CITY("Vatican City", "VA"),
    VENEZUELA("Venezuela", "VE"),
    VIETNAM("Vietnam", "VN"),
    YEMEN("Yemen", "YE"),
    ZAMBIA("Zambia", "ZM"),
    ZIMBABWE("Zimbabwe", "ZW"),
    UNKNOWN("Unknown", StringUtil.EMPTY);

    private static final Map<String, Country> CODE_TO_COUNTRY_MAP
            = Arrays.stream(values()).collect(Collectors.toMap(Country::getCode, Function.identity()));

    private final String name;
    private final String code;

    Country(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public static Country fromCode(String code) {
        return CODE_TO_COUNTRY_MAP.getOrDefault(code, UNKNOWN);
    }

    public boolean isKnown() {
        return this != UNKNOWN;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
