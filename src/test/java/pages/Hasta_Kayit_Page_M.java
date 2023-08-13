package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hasta_Kayit_Page_M {
    public Hasta_Kayit_Page_M(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // Bu bir denemedir
    // Bu da bir denemedir
    // Bu bir denemedirden sonraki denemedir
    // 4. deneme
    // 5. değişiklik merve den


    @FindBy(xpath = "(//input[@class='inpt wpx50'])[3]")
    public WebElement kurum;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[4]")
    public WebElement kurumDetay;

    @FindBy(id = "PopupSaveButton_0")
    public  WebElement saveButton;
    @FindBy(xpath = "(//p)[1]")
    public WebElement HataMassage;

    //----------------------------- Merve
    @FindBy(id="CHK_HASTA_KAYIT_YENIDOGAN")
    public WebElement yenidoganCheckBox;

    @FindBy(id="TXT_HASTA_KAYIT_DOGUM_SIRASI")
    public WebElement dogumSirasiSearchBox;

    @FindBy(id="CHK_HASTA_KAYIT_MAVIKART")
    public WebElement maviKartCheckBox;

    @FindBy(id="TXT_HASTA_KAYIT_TC_KIMLIK_NO")
    public WebElement TCsearchBox;

    @FindBy(id="TXT_HASTA_KAYIT_DOGUM_TARIHI")
    public WebElement dateOfBirthSearchBox;

    @FindBy(xpath = "//a[@onclick='HastaKayitTCKimlikAktar()']")
    public WebElement TCaktarButton;

    @FindBy(xpath = "//a[@onclick='HastaKayitTCKimlikDogrula()']")
    public WebElement TCDogrulaButton;

    @FindBy(xpath = "//*[@id=\"dlgKurumArama\"]/div[2]/div[1]/a/span")
    public WebElement dogrulaKapatButton;

    @FindBy(id="TXT_HASTA_KAYIT_SOYADI")
    public WebElement surnameSearchBox;

    @FindBy(id="TXT_HASTA_KAYIT_ADI")
    public WebElement nameSearchBox;

    @FindBy(id="CMB_HASTA_KAYIT_YAKINLIK")
    public WebElement yakinligiDropdown;

    @FindBy(id="TXT_HASTA_KAYIT_KART_SAHIBI")
    public WebElement kartSahibiSearchBox;

    @FindBy(id="CMB_HASTA_KAYIT_CINSIYET")
    public  WebElement genderDropdown;

    @FindBy(id="TXT_HASTA_KAYIT_MEDENI_HAL")
    public WebElement medeniHaliSearchBox;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_TAHSIS_NO']")
    public WebElement pasaportIdSearchBox;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_KARNE_SERI']")
    public WebElement pasaportNoSearchBox1;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_KARNE_NO']")
    public WebElement pasaportNoSearchBox2;

    @FindBy(xpath = "//tr[@id='HastaListesi_DXEmptyRow']")
    public WebElement patientListMessage;

    //------------------------------- İlyas
    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_TEL\"]")
    public WebElement telefonnumarasi;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_CEP_TEL\"]")
    public WebElement mobilePhoneNumber;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_EMAIL\"]")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_MESLEK_KODU\"]")
    public WebElement meslek;

    @FindBy(xpath = "//*[@id=\"CMB_HASTA_KAYIT_STATUS\"]")
    public WebElement statu;

    @FindBy(xpath = "//*[@id=\"CMB_HASTA_KAYIT_OGRENIM\"]")
    public WebElement ogrenim;

    @FindBy(xpath = "//*[@id=\"CMB_HASTA_KAYIT_KAN_GRUBU\"]")
    public WebElement kangrubu;

    @FindBy(xpath = "//*[@id='CHK_HASTA_KAYIT_SMS_GONDERILEBILIR']")
    public WebElement SMS;

    @FindBy(id = "CHK_HASTA_KAYIT_EMAIL_GONDERILEBILIR")
    public WebElement EMAIL;

    @FindBy(xpath = "//*[@id='CHK_HASTA_KAYIT_KIMLIK_FOTOKOPISI']")
    public WebElement kimlikfotokopi;

    @FindBy(xpath = "//*[@id='CHK_HASTA_KAYIT_KVKK_ONAM']")
    public WebElement KVKK;

    //----------------------------------------------------- Fatih


    @FindBy(xpath = "//input[@class='inpt wpx270']")
    public WebElement adresSearchBox;

    @FindBy(xpath = "//input[@class='inpt wpx265']")
    public WebElement adresSearchBox2;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[9]")
    public WebElement ilSearchBox;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[10]")
    public  WebElement ilceSearchBox;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[11]")
    public  WebElement mahalleSearchBox;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[10]")
    public  WebElement koySearchBox;

    @FindBy(xpath = "//input[@class='inpt wpx160']")
    public  WebElement caddeSkSearchBox;

    @FindBy(xpath = "//input[@class='inpt wpx70']")
    public  WebElement postaKoduSearchBox;

    @FindBy(xpath = "(//a[@class='hastaButton backWhite'])[6]")
    public  WebElement adresAktarButton;

    @FindBy(xpath = "(//a[@class='hastaButton backWhite'])[7]")
    public  WebElement beyanAdresButton;

    @FindBy(xpath = "//textarea[@class='inpt wpx355']")
    public WebElement aciklamaSearchBox;

    //--------------------------------------------------------- Baris

    @FindBy(id = "CMB_HASTA_KAYIT_UYRUK")
    public  WebElement nationalityDropdown;

    @FindBy(xpath = "/html/body/div[10]/div[2]/div[2]/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div/input[3]")
    public  WebElement patientType;

    @FindBy(xpath = "//*[@id=\"HastaTuruList_tccell0_2\"]/a")
    public WebElement dualCitizensChooseButton;

    @FindBy(xpath = "(//select[@class='inpt '])[2]")
    public  WebElement basvuruSekliDropdown;

    @FindBy(xpath = "(//input[@class='inpt '])[13]")
    public  WebElement babaAdiSearchBox;

    @FindBy(xpath = "(//input[@class='inpt '])[14]")
    public  WebElement anaAdiSearchBox;

    @FindBy(xpath = "(//input[@class='inpt '])[15]")
    public  WebElement dogumYeriSearchBox;

    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_TC_KIMLIK_NO")
    public  WebElement anneTCNoSearchBox;

    @FindBy(xpath = "(//a[@class='hastaButton backWhite'])[5]")
    public  WebElement dogrulaF1Button;

    @FindBy(xpath = "//input[@id='TXT_HASTA_KAYIT_ANNE_DOGUM_TARIHI']")
    public WebElement anneDogumTarihiSearchBox;

    @FindBy(xpath = "(//a[@class='hem_border hem_button hem_sil hem_left lookupClearButton backWhite'])")
    public  WebElement hastaTuruSilmeButton;

    @FindBy(xpath = "(//input[@class='inpt  lookupOpenButton'])[3]")
    public  WebElement hastaTuruButton;

    @FindBy(xpath = "//*[@id=\"hataIcerik\"]/div/div[1]/p")
    public WebElement institutionInformationWarningMessage;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/p")
    public WebElement transactionSuccessfulWarningMessage;

    @FindBy(xpath = "//label[@id=\"LB_TAHSIS_NO\"]")
    public WebElement passportIdBoxName;

    @FindBy(xpath = "//label[@id=\"LB_KARNE_SERI_NO\"]")
    public WebElement passportNoBoxName;

    @FindBy(xpath = "//*[@id=\"LB_TAHSIS_NO\"]")
    public WebElement allocationNumberBoxName;

    @FindBy(xpath = "//*[@id=\"LB_KARNE_SERI_NO\"]")
    public WebElement reportCardSerialNoBoxName;

    @FindBy (xpath = "//a[@class='PopupCloseButton PopupButton']")
    public WebElement closeButton;

    @FindBy (xpath = "//*[@id=\"onayVazgecIcerik\"]/div/div[3]/span[2]")
    public WebElement noItem;

    @FindBy (xpath = "/html/body/div[1]/div[3]/header/nav[2]/ul/li[3]/a")
    public WebElement user;

    @FindBy (xpath = "/html/body/div[1]/div[3]/header/nav[2]/ul/li[3]/ul/li[10]/a")
    public WebElement exit;





}
