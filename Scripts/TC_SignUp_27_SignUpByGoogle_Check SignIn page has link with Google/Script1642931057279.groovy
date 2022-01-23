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

WebUI.click(findTestObject('Object Repository/Page_ng k nhp hc - HOCMAI/div_ng k qua Google'))

WebUI.switchToWindowTitle('Đăng nhập - Tài khoản Google')

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/input_hocmai.vn_identifier'), 'sangdangthithu@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/div_iu khon dch v_VfPpkd-RLmnJb'))

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/div_Trnh duyt hoc ng dng ny c th khng an to_68d7f8'))

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/input_hocmai.vn_identifier'), 'sangdangthithu@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/input_hocmai.vn_identifier'), Keys.chord(Keys.ENTER))

