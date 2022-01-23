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

WebUI.setText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_name'), 'Full name')

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/form_To ti khon ca bn            Hc tp v gi_ad6b21'))

WebUI.setText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_emailtxt'), 'sangdang@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_phonetxt'))

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/div_To ti khon ca bn            Hc tp v gia_1fbe12'))

WebUI.setText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_emailtxt'), 'sangdangdang@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_phonetxt'), '0349775374')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_passwordtxt'), 'gvp66Uw0jqOD/03MOq0BRg==')

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/div_mnh mt khu Kh ttMt khu c  di t 8 k t tr_d7a0ce'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_passwordtxt'), 'gvp66Uw0jqOD/03MOq0BRg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/input_Hoc_repaswordtxt'), 'JkYzbGlbK9hnvSDlbdG7VelcmfWgousS7d53QQ0HzCMn/4TPfttNseNIo4i1A+rzoG4NU3luBmCrk9rO9LyYn6maIhns/i9Riz84aNCVOzF2636Q5a5cjmigerpN9IXGd+fMIbMpiGL1a4VnHwH2ng==')

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/form_To ti khon ca bn            Hc tp v gi_ad6b21_1'))

