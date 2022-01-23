import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hocmai.vn/loginv2/signup.php?fbclid=IwAR2wW4_oL9sR1jVbaSjL6l167lJFKatmc3xYUqhf5G_-739TCUHi78nwI84')

WebUI.setText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_name'), 'Đặng Thị Thu Sang')

WebUI.setText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Vui lng nhp H v tn ca bn_emailtxt'), 'sang.dang22@student.passerellesnumeriques.org')

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/form_To ti khon ca bn            Hc tp v gi_ad6b21'))

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/div_To ti khon ca bn            Hc tp v gia_1fbe12'))

WebUI.setText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Vui lng nhp H v tn ca bn_emailtxt'), 'sangdangdang2308@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_phonetxt'), '0349775374')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_passwordtxt'), 'SP6QP37zsnUBPsEan+luc2ft3YO9qzpV')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_repaswordtxt'), 'SP6QP37zsnUBPsEan+luc2ft3YO9qzpV')

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Chnh sch bo mt, iu khon dch v v chnh _799942'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_passwordtxt'), 'SP6QP37zsnUBPsEan+luc3jUGcsaFbHF')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_repaswordtxt'), 'SP6QP37zsnUBPsEan+luc3jUGcsaFbHF')

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Chnh sch bo mt, iu khon dch v v chnh _799942'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/input_Vui lng nhp vo s di ng ca bn_addphonetxt'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/button_Kch hot'))

WebUI.setText(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/input_sangdangdang2308gmail.com_code'), '8499')

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/button_Kch hot'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/span_Hc sinh'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/span_Ngy'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/span_Thng'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/span_Nm'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/span_--Chn trng--'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/span_--Chn lp--'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/span_--Chn qunhuyn--'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/span_--Chn tnhthnh ph--'))

WebUI.setText(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/input_concat(id(, , select2-city-container,_d6b949'), 
    'Bình')

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/span_--Chn qunhuyn--'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/span_--Chn lp--'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/span_--Chn trng--'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - HOCMAI/input_THPT Nguyn Hng o_submit register-btn'))

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/a_Tip tc'))

