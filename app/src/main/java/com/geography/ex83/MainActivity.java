package com.geography.ex83;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * @author Yanir Aton
 * @version 1.0
 * @since 2023-9-15
 * this is MainActivity class
 * this app is a geography app that allows user to select a continent and then a country
 * it will show the capital, population, language, and anthem of the selected country
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener,AdapterView.OnItemClickListener {

    Spinner cntinentsSpinner;
    ListView countryList;

    continent[] continents;
    int currentContinent;

    TextView capitalText,populationText,languageText,anthemText;


    String[] continentsName = {"South America","Europe","Asia","North America","Oceania","Africa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        continents = createEarth();


        //  connect the views to the xml file
        cntinentsSpinner = (Spinner) findViewById(R.id.cntinentsSpinner);
        countryList = (ListView) findViewById(R.id.countryList);
        capitalText = (TextView) findViewById(R.id.capitalText);
        populationText = (TextView) findViewById(R.id.populationSizeText);
        languageText = (TextView) findViewById(R.id.languageText);
        anthemText = (TextView) findViewById(R.id.anthemText);


        // create the spinner
        cntinentsSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,continentsName);
        cntinentsSpinner.setAdapter(adapter);

        // create the listview
        countryList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        countryList.setOnItemClickListener(this);






    }

    /**
     * this method is used to create the continent array that includes all the data about the countries
     * @return the continent array
     */
    public continent[] createEarth() {
        continent[] continents = new continent[7];
        continents[0] = new continent("South America");
        continents[1] = new continent("Europe");
        continents[2] = new continent("Asia");
        continents[3] = new continent("North America");
        continents[4] = new continent("Oceania");
        continents[5] = new continent("Africa");

        //south America
        country Brazil = new country("Brazil","Brasília",203062512,"Portuguese", "\"Hino Nacional Brasileiro\" (\"Brazilian National Anthem\")");
        country Colombia = new country("Colombia","Bogotá",52215503,"Spanish", "\"Himno Nacional de la República de Colombia\" (\"National Anthem of the Republic of Colombia\")");
        country Argentina = new country("Argentina","Buenos Aires",46654581,"None (Spanish has de facto status)", "\"Himno Nacional Argentino\" (\"Argentine National Anthem\")");
        country Peru = new country("Peru","Lima",33396698,"Peruvian Spanish Quechua Aymara Asháninka", "\"Himno Nacional del Perú\" (\"National Anthem of Peru\")");
        country Paraguay = new country("Paraguay","Asunción",6109644,"Spanish Guaraní", "\"Himno Nacional Paraguayo\" (\"Paraguayan National Anthem\")");
        country Guyana = new country("Guyana","Georgetown",743699,"English", "\"Dear Land of Guyana, of Rivers and Plains\"");
        country Suriname = new country("Suriname","Paramaribo",616500,"Dutch", "\"God zij met ons Suriname\" (\"God Be With Our Suriname\")");
        country[] South_America = {Brazil, Colombia, Argentina, Peru, Paraguay, Guyana, Suriname};
        String[] southAmericaCountriesName = {"Brazil", "Colombia", "Argentina", "Peru", "Paraguay", "Guyana", "Suriname"};

        //Europe
        country Russia = new country("Russia","Moscow",146424729,"Russian", "\"Gosudarstvenny Gimn Rossiyskoy Federatsii\" (\"State Hymn of the Russian Federation\")");
        country Germany = new country("Germany","Berlin",84432670,"German", "\"Lied der Deutschen\" (\"Song of the Germans\")");
        country France = new country("France","Paris",68151000,"French", "\"La Marseillaise\" (\"The Marseillaise\")");
        country Spain = new country("Spain","Madrid",48345223,"Spanish", "\"La Marcha Real\" (\"The Royal March\")");
        country Romania = new country("Romania","Bucharest",19051562,"Romanian", "\"Deșteaptă-te, române!\" (\"Awaken Thee, Romanian!\")");
        country Netherlands = new country("Netherlands","The Hague (de facto)",17919000,"Dutch", "\"Wilhelmus\" (\"William\")");
        country Belgium = new country("Belgium","Brussels",11765225,"Dutch French German", "\"La Brabançonne\" (\"The Brabantian\")");
        country Czech_Republic = new country("Czech Republic","Prague",10850620,"Czech Slovak", "\"Kde domov můj\" (\"Where My Home is\")");
        country Greece = new country("Greece","Athens",10482487,"Greek", "\"Ὕμνος εἰς τὴν Ἐλευθερίαν/Ὕμνος πρὸς τὴν ἘλευθερίανÝmnos eis tīn Eleutherían\" (\"Hymn to Liberty\" or \"Hymn to Freedom\")");
        country Portugal = new country("Portugal","Lisbon",10467366,"Portuguese", "\"A Portuguesa\" (\"The Portuguese\")");
        country Hungary = new country("Hungary","Budapest",9597085,"Hungarian", "\"Himnusz\" (\"Hymn\")");
        country Belarus = new country("Belarus","Minsk",9200617,"Belarusian Russian", "\"My Belarusy\" (\"We, the Belarusians\")");
        country Switzerland = new country("Switzerland","Bern (de facto)",8865270,"French (Bern, Fribourg, Geneva, Jura, Neuchâtel, Valais, Vaud) German (Aargau, Appenzell Ausserrhoden, Appenzell Innerrhoden, Basel-Landschaft, Basel-Stadt, Bern, Fribourg, Glarus, Graubünden, Lucerne, Nidwalden, Obwalden, Saint Gallen, Schaffhausen, Schwyz, Solothurn, Thurgau, Uri, Valais, Zug, Zürich) Italian (Ticino, Graubünden) Romansh (Graubünden)", "\"Schweizerpsalm\" (\"Swiss Psalm\")");
        country Serbia = new country("Serbia","Belgrade",6647003,"Serbian", "\"Bože pravde\" (\"God of Justice\")");
        country Denmark = new country("Denmark","Copenhagen",5944145,"Danish", "\"Der er et yndigt land\" (\"There is a lovely land\")");
        country Finland = new country("Finland","Helsinki",5547549,"Finnish Swedish", "Finnish: \"Maamme\" Swedish: \"Vårt Land\" (\"Our Land\")");
        country Norway = new country("Norway","Oslo",5514042,"Norwegian Sami languages", "\"Ja, vi elsker dette landet\" (\"Yes, We Love This Country\")");
        country Slovakia = new country("Slovakia","Bratislava",5426857,"Slovak", "\"Nad Tatrou sa blýska\" (\"Lightning Over the Tatras\")");
        country Moldova = new country("Moldova","Chișinău",2512758,"Romanian", "\"Limba noastră\" (\"Our Language\")");
        country Slovenia = new country("Slovenia","Ljubljana",2117674,"Slovene", "\"Zdravljica\" (\"A Toast\")");
        country Luxembourg = new country("Luxembourg","Luxembourg",660809,"French German Luxembourgish", "\"Ons Heemecht\" (\"Our Homeland\")");
        country Montenegro = new country("Montenegro","Podgorica",616695,"Montenegrin", "\"Oj, svijetla majska zoro\" (\"O, Bright Dawn of May\")");
        country Iceland = new country("Iceland","Reykjavík",394200,"Icelandic Icelandic Sign Language", "\"Lofsöngur\" (\"Hymn\")");
        country Andorra = new country("Andorra","Andorra la Vella",83523,"Catalan", "\"El gran Carlemany\" (\"The Great Charlemagne\")");
        country[] Europe = {Russia, Germany, France, Spain, Romania, Netherlands, Belgium, Czech_Republic, Greece, Portugal, Hungary, Belarus, Switzerland, Serbia, Denmark, Finland, Norway, Slovakia, Moldova, Slovenia, Luxembourg, Montenegro, Iceland, Andorra};
        String[] europeCountriesNames = {"Russia", "Germany", "France", "Spain", "Romania", "Netherlands", "Belgium", "Czech Republic", "Greece", "Portugal", "Hungary", "Belarus", "Switzerland", "Serbia", "Denmark", "Finland", "Norway", "Slovakia", "Moldova", "Slovenia", "Luxembourg", "Montenegro", "Iceland", "Andorra"};


        //Asia
        country China = new country("China","Beijing",1411750000,"Standard Chinese", "\"Yìyǒngjūn Jìnxíngqǔ\" (\"March of the Volunteers\")");
        country India = new country("India","New Delhi",1392329000,"Hindi English", "\"जन-गण-मन \" (\"Jana-Gana-Mana\") (\"Hail the ruler of all minds\")");
        country Indonesia = new country("Indonesia","Jakarta",277749853,"Indonesian", "\"Indonesia Raya\" (\"Great Indonesia\")");
        country Pakistan = new country("Pakistan","Islamabad",241499431,"Urdu English", "\"Qaumī Tarāna\" (\"National Anthem\")");
        country Bangladesh = new country("Bangladesh","Dhaka",169828911,"Bengali", "\"Amar Shonar Bangla\" (\"My Golden Bengal\")");
        country Philippines = new country("Philippines","Manila",110700000,"Filipino English", "\"Lupang Hinirang\" (\"Chosen Land\")");
        country Turkey = new country("Turkey","Ankara",85279553,"Turkish", "\"İstiklâl Marşı\" (\"The March of Independence\")");
        country Thailand = new country("Thailand","Bangkok",68263022,"Thai", "\"Phleng Chat\" (\"National Song\")");
        country Iraq = new country("Iraq","Baghdad",43324000,"Arabic Kurdish", "\"Mawtini\" (\"My Homeland\")");
        country Malaysia = new country("Malaysia","Putrajaya (administrative and judicial)",33200000,"Malay", "\"Negaraku\" (\"My Country\")");
        country Nepal = new country("Nepal","Kathmandu",29164578,"Nepali", "\"सयौँ थुँगा फूलका\" (\"Made of Hundreds of Flowers\")");
        country North_Korea = new country("North Korea","Pyongyang",25660000,"Korean", "\"Aegukka\" (\"The Patriotic Song\")");
        country Syria = new country("Syria","Damascus",22923000,"Arabic", "\"Humāt ad-Diyār\" (\"Guardians of the Homeland\")");
        country Sri_Lanka = new country("Sri Lanka","Sri Jayawardenepura Kotte (official)",22181000,"Sinhala Tamil", "\"Sri Lanka Matha\" (\"Mother Sri Lanka\")");
        country Kazakhstan = new country("Kazakhstan","Astana",19899377,"Kazakh Russian", "\"Meniñ Qazaqstanım\" (\"My Kazakhstan\")");
        country Cambodia = new country("Cambodia","Phnom Penh",15552211,"Khmer", "\"Nokor Reach\" (\"Royal Kingdom\")");
        country Jordan = new country("Jordan","Amman",11471200,"Arabic", "\"Al-salam Al-malaki Al-urdoni\" (\"The Royal Anthem of Jordan\")");
        country Azerbaijan = new country("Azerbaijan","Baku",10135373,"Azerbaijani", "\"Azərbaycan marşı\" (\"Azerbaijan's Anthem\")");
        country Tajikistan = new country("Tajikistan","Dushanbe",10077600,"Tajik", "\"Surudi Milli\" (\"National Anthem\")");
        country Israel = new country("Israel","Jerusalem",9795000,"Hebrew", "\"הַתִּקְוָה Hatikvah\" (\"The Hope\")");
        country Kyrgyzstan = new country("Kyrgyzstan","Bishkek",7100000,"Kyrgyz Russian", "\"Kyrgyz Respublikasynyn Mamlekettik Gimni\" (\"National Anthem of the Kyrgyz Republic\")");
        country Lebanon = new country("Lebanon","Beirut",5490000,"Arabic", "\"Lebanese National Anthem\"");
        country Oman = new country("Oman","Muscat",5079514,"Arabic", "\"Nashid as-Salaam as-Sultani\" (\"Sultanic Salute\")");
        country Kuwait = new country("Kuwait","Kuwait City",4670713,"Standard Arabic", "\"Al-Nasheed Al-Watani\" (\"National Anthem\")");
        country Qatar = new country("Qatar","Doha",3005069,"Arabic", "\"As Salam al Amiri\" (\"Peace to the Amir\")");
        country Bahrain = new country("Bahrain","Manama",1577059,"Arabic", "\"Bahrainona\" (\"Our Bahrain\")");
        country Cyprus = new country("Cyprus","Nicosia",918100,"Greek Turkish", "\"Ýmnos eis tīn Eleutherían\" (\"Hymn to Liberty\")");
        country Brunei = new country("Brunei","Bandar Seri Begawan",440715,"Malay", "\"Allah Peliharakan Sultan\" (\"God Bless the Sultan\")");
        country Maldives = new country("Maldives","Malé",397372,"Dhivehi", "\"Gaumii salaam\" (\"National Salute\")");
        country[] Asia = {China, India, Indonesia, Pakistan, Bangladesh, Philippines, Turkey, Thailand, Iraq, Malaysia, Nepal, North_Korea, Syria, Sri_Lanka, Kazakhstan, Cambodia, Jordan, Azerbaijan, Tajikistan, Israel, Kyrgyzstan, Lebanon, Oman, Kuwait, Qatar, Bahrain, Cyprus, Brunei, Maldives};
        String[] asiaCountriesNames = {"China", "India", "Indonesia", "Pakistan", "Bangladesh", "Philippines", "Turkey", "Thailand", "Iraq", "Malaysia", "Nepal", "North Korea", "Syria", "Sri Lanka", "Kazakhstan", "Cambodia", "Jordan", "Azerbaijan", "Tajikistan", "Israel", "Kyrgyzstan", "Lebanon", "Oman", "Kuwait", "Qatar", "Bahrain", "Cyprus", "Brunei", "Maldives"};


        //North america
        country Mexico = new country("Mexico","Mexico City",129202482,"None (Spanish has de facto status)", "\"Himno Nacional Mexicano\" (\"Mexican National Anthem\")");
        country Canada = new country("Canada","Ottawa",40341400,"English (Federal) French (Federal)", "\"Ô Canada\" (\"O Canada\")");
        country Guatemala = new country("Guatemala","Guatemala City",17109746,"Spanish", "\"Himno Nacional de Guatemala\" (\"National Anthem of Guatemala\")");
        country Haiti = new country("Haiti","Port-au-Prince",11743017,"French Haitian Creole", "\"La Dessalinienne\" (\"Song of Dessalines\")");
        country Cuba = new country("Cuba","Havana",11089511,"Spanish", "\"El Himno de Bayamo\" (\"The Anthem of Bayamo\")");
        country Nicaragua = new country("Nicaragua","Managua",6595674,"Spanish", "\"Salve a ti, Nicaragua\" (\"Hail to Thee, Nicaragua\")");
        country Panama = new country("Panama","Panama City",4278500,"Spanish", "\"Himno Istmeño\" (\"Hymn of the Isthmus\")");
        country Jamaica = new country("Jamaica","Kingston",2825544,"English", "\"Jamaica, Land We Love\"");
        country Trinidad_and_Tobago = new country("Trinidad and Tobago","Port of Spain",1365805,"English", "\"Forged from the Love of Liberty\"");
        country Belize = new country("Belize","Belmopan",441471,"English", "\"Land of the Free\"");
        country Barbados = new country("Barbados","Bridgetown",267800,"English", "\"In Plenty and In Time of Need\"");
        country Saint_Lucia = new country("Saint Lucia","Castries",178696,"English", "\"Sons and Daughters of Saint Lucia\"");
        country Saint_Vincent_and_the_Grenadines = new country("Saint Vincent and the Grenadines","Kingstown",110872,"English", "\"Saint Vincent, Land so beautiful\"");
        country Saint_Kitts_and_Nevis = new country("Saint Kitts and Nevis","Basseterre",47195,"English", "\"O Land of Beauty!\"");
        country[] North_America = {Mexico, Canada, Guatemala, Haiti, Cuba, Nicaragua, Panama, Jamaica, Trinidad_and_Tobago, Belize, Barbados, Saint_Lucia, Saint_Vincent_and_the_Grenadines, Saint_Kitts_and_Nevis};
        String[] northAmericaCountriesNames = {"Mexico", "Canada", "Guatemala", "Haiti", "Cuba", "Nicaragua", "Panama", "Jamaica", "Trinidad and Tobago", "Belize", "Barbados", "Saint Lucia", "Saint Vincent and the Grenadines", "Saint Kitts and Nevis"};


        //Oceania
        country Australia = new country("Australia","Canberra",26744100,"None (English has de facto status)", "\"Advance Australia Fair\"");
        country Papua_New_Guinea = new country("Papua New Guinea","Port Moresby",11781559,"English Hiri Motu PNG Sign Language Tok Pisin", "\"O Arise, All You Sons\"");
        country Solomon_Islands = new country("Solomon Islands","Honiara",728041,"English", "\"God Save Our Solomon Islands\"");
        country Samoa = new country("Samoa","Apia",205557,"English Samoan", "\"The Banner of Freedom\"");
        country Tonga = new country("Tonga","Nukuʻalofa",100179,"English Tongan", "\"Ko e fasi ʻo e tuʻi ʻo e ʻOtu Tonga\" (\"Song of the King of the Tonga Islands\")");
        country Marshall_Islands = new country("Marshall Islands","Majuro",39262,"English Marshallese", "\"Forever Marshall Islands\"");
        country Palau = new country("Palau","Ngerulmud",16733,"English Palauan", "\"Belau rekid\" (\"Our Palau\")");
        country[] Oceania = {Australia, Papua_New_Guinea, Solomon_Islands, Samoa, Tonga, Marshall_Islands, Palau};
        String[] oceaniaCountriesNames = {"Australia", "Papua New Guinea", "Solomon Islands", "Samoa", "Tonga", "Marshall Islands", "Palau"};

        //Africa
        country Nigeria = new country("Nigeria","Abuja",216783400,"English", "\"Arise, O Compatriots\"");
        country Ethiopia = new country("Ethiopia","Addis Ababa",107334000,"Afar Amharic Oromo Somali Tigrinya", "\"Wodefit Gesgeshi, Widd Innat Ityopp'ya\" (\"March Forward, Dear Mother Ethiopia\")");
        country Egypt = new country("Egypt","Cairo",105308000,"Arabic", "\"Bilady, Bilady, Bilady\" (\"My Country, My Country, My Country\")");
        country Tanzania = new country("Tanzania","Dodoma",61741120,"Swahili English", "\"Mungu ibariki Afrika\" (\"God Bless Africa\")");
        country South_Africa = new country("South Africa","Pretoria (executive)",60604992,"Afrikaans English Southern Ndebele Sotho Northern Sotho Swazi Tsonga Tswana Venda Xhosa Zulu", "\"National anthem of South Africa\"");
        country Kenya = new country("Kenya","Nairobi",51526000,"English Swahili", "\"Ee Mungu Nguvu Yetu\" (\"Oh God of All Creation\")");
        country Sudan = new country("Sudan","Khartoum",41984500,"Arabic English", "\"Nahnu Jund Allah Jund Al-watan\" (\"We Are the Army of God and of Our Land\")");
        country Morocco = new country("Morocco","Rabat",37094400,"Arabic Berber", "\"Hymne Chérifien\" (\"Cherifian Anthem\")");
        country Mozambique = new country("Mozambique","Maputo",32419747,"Portuguese", "\"Pátria Amada\" (Beloved Homeland\")");
        country Ghana = new country("Ghana","Accra",30832019,"English", "\"God Bless Our Homeland Ghana\"");
        country Madagascar = new country("Madagascar","Antananarivo",26923353,"French Malagasy", "\"Ry Tanindrazanay malala ô!\" (\"Oh, Beloved Land of our Ancestors\")");
        country Niger = new country("Niger","Niamey",24112753,"French", "\"L'Honneur de la Patrie\" (\"The Honour of the Fatherland\")");
        country Mali = new country("Mali","Bamako",23293699,"Bambara Bobo Bozo Dogon Fula Hassaniya Kassonke Maninke Minyanka Senufo Songhay languages Soninke Tamasheq", "\"Le Mali\" (\"Mali\")");
        country Burkina_Faso = new country("Burkina Faso","Ouagadougou",22185654,"French", "\"Une Seule Nuit\" (\"One Single Night\")");
        country Malawi = new country("Malawi","Lilongwe",21507723,"English Chichewa", "\"Mulungu dalitsa Malaŵi\" (\"God Bless Malawi\")");
        country Somalia = new country("Somalia","Mogadishu",18143379,"Somali, Arabic", "\"Qolobaa Calankeed\" (\"Praise to the Flag\")");
        country Senegal = new country("Senegal","Dakar",17223497,"French", "\"Pincez Tous vos Koras, Frappez les Balafons\" (\"Strum your Koras, Strike the Balafons\")");
        country Chad = new country("Chad","N'Djamena",16818391,"Arabic French", "\"La Tchadienne\" (\"People of Chad\")");
        country Guinea = new country("Guinea","Conakry",13261638,"French", "\"Liberté\" (\"Freedom\")");
        country South_Sudan = new country("South Sudan","Juba",13249924,"English", "\"South Sudan Oyee!\"");
        country Rwanda = new country("Rwanda","Kigali",13246394,"English French Kinyarwanda Swahili", "\"Rwanda Nziza\" (\"Beautiful Rwanda\")");
        country Benin = new country("Benin","Porto-Novo (official)",12606998,"French", "\"L'Aube Nouvelle\" (\"The Dawn of a New Day\")");
        country Sierra_Leone = new country("Sierra Leone","Freetown",8494260,"English", "\"High We Exalt Thee, Realm of the Free\"");
        country Togo = new country("Togo","Lomé",8095498,"French", "\"Salut à toi, pays de nos aïeux\" (\"Hail to Thee, Land of our Forefathers\")");
        country Central_African_Republic = new country("Central African Republic","Bangui",5633412,"French Sango", "\"La Renaissance\" (\"The Rebirth\")");
        country Liberia = new country("Liberia","Monrovia",4661010,"English", "\"All Hail, Liberia, Hail!\"");
        country Mauritania = new country("Mauritania","Nouakchott",4372037,"Arabic", "\"Bilada-l ubati-l hudati-l kiram\" (\"Country of the Proud, Guiding Noblemen\")");
        country Eritrea = new country("Eritrea","Asmara",3748902,"Tigrinya", "\"Ertra, Ertra, Ertra\" (\"Eritrea, Eritrea, Eritrea\")");
        country Botswana = new country("Botswana","Gaborone",2410338,"English", "\"Fatshe leno la rona\" (\"Blessed Be This Noble Land\")");
        country Lesotho = new country("Lesotho","Maseru",2306000,"Sotho English", "\"Lesotho Fatše La Bontata Rona\" (\"Lesotho, Land of Our Fathers\")");
        country Gabon = new country("Gabon","Libreville",2233272,"French", "\"La Concorde\" (\"The Concorde\")");
        country Guinea_Bissau = new country("Guinea-Bissau","Bissau",1781308,"Portuguese", "\"Esta É a Nossa Pátria Bem Amada\" (\"This Is Our Beloved Country\")");
        country Equatorial_Guinea = new country("Equatorial Guinea","Malabo",1558160,"French Portuguese Spanish", "\"Caminemos pisando las sendas de nuestra inmensa felicidad\" (\"Let Us Tread the Path of our Immense Happiness\")");
        country Mauritius = new country("Mauritius","Port Louis",1261196,"English Mauritian Creole (Also known as 'Morisien')", "\"Motherland\"");
        country Eswatini = new country("Eswatini","Mbabane (administrative)",1223362,"English Swazi", "\"Nkulunkulu Mnikati wetibusiso temaSwati\" (\"O Lord our God of the Swazi\")");
        country Djibouti = new country("Djibouti","Djibouti",1001454,"Arabic French", "\"Djibouti\"");
        country Comoros = new country("Comoros","Moroni",758316,"Arabic Comorian French", "\"Udzima wa ya Masiwa\" (\"The Union of the Great Islands\")");
        country Cape_Verde = new country("Cape Verde","Praia",569509,"Portuguese", "\"Cântico da Liberdade\" (\"Song of Freedom\")");
        country[] Africa = {Nigeria, Ethiopia, Egypt, Tanzania, South_Africa, Kenya, Sudan, Morocco, Mozambique, Ghana, Madagascar, Niger, Mali, Burkina_Faso, Malawi, Somalia, Senegal, Chad, Guinea, South_Sudan, Rwanda, Benin, Sierra_Leone, Togo, Central_African_Republic, Liberia, Mauritania, Eritrea, Botswana, Lesotho, Gabon, Guinea_Bissau, Equatorial_Guinea, Mauritius, Eswatini, Djibouti, Comoros, Cape_Verde};
        String[] africaCountryNames = {"Nigeria", "Ethiopia", "Egypt", "Tanzania", "South Africa", "Kenya", "Sudan", "Morocco", "Mozambique", "Ghana", "Madagascar", "Niger", "Mali", "Burkina Faso", "Malawi", "Somalia", "Senegal", "Chad", "Guinea", "South Sudan", "Rwanda", "Benin", "Sierra Leone", "Togo", "Central African Republic", "Liberia", "Mauritania", "Eritrea", "Botswana", "Lesotho", "Gabon", "Guinea-Bissau", "Equatorial Guinea", "Mauritius", "Eswatini", "Djibouti", "Comoros", "Cape Verde"};


        continents[0].setCountries(South_America);
        continents[0].setCountriesString(southAmericaCountriesName);
        continents[1].setCountries(Europe);
        continents[1].setCountriesString(europeCountriesNames);
        continents[2].setCountries(Asia);
        continents[2].setCountriesString(asiaCountriesNames);
        continents[3].setCountries(North_America);
        continents[3].setCountriesString(northAmericaCountriesNames);
        continents[4].setCountries(Oceania);
        continents[4].setCountriesString(oceaniaCountriesNames);
        continents[5].setCountries(Africa);
        continents[5].setCountriesString(africaCountryNames);

        return continents;
    }


    /**
     * this method is activated when the user selects a continent from the spinner and will change the listview to the countries of the selected continent
     * @param parent The AdapterView where the selection happened
     * @param view The view within the AdapterView that was clicked
     * @param position The position of the view in the adapter
     * @param id The row id of the item that is selected
     */
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,continents[position].getCountriesString());
        countryList.setAdapter(adp);
        currentContinent = position;

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

    /**
     * this method is activated when the user clicks on a country from the listview and it will update the dada on the country
     * @param parent The AdapterView where the click happened.
     * @param view The view within the AdapterView that was clicked (this
     *            will be a view provided by the adapter)
     * @param position The position of the view in the adapter.
     * @param id The row id of the item that was clicked.
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        capitalText.setText("Capital = " + continents[currentContinent].getCountries()[position].getCapital());
        populationText.setText("populasion = " + String.valueOf(continents[currentContinent].getCountries()[position].getPopulation()));
        languageText.setText("Languages = " + continents[currentContinent].getCountries()[position].getLanguage());
        anthemText.setText("anthem = " + continents[currentContinent].getCountries()[position].getAnthem());

    }
}