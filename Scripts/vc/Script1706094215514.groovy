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

// Открыть браузер
WebUI.openBrowser('')

WebUI.deleteAllCookies()

// Перейти по URL после очистки кэша
WebUI.navigateToUrl('https://vc.ru/')

// Выполнение последовательности действий на веб-странице
WebUI.click(findTestObject('Object Repository/Page_vc.ru  , , ,  ,/button_'))

WebUI.click(findTestObject('Object Repository/Page_vc.ru  , , ,  ,/a_'))

WebUI.click(findTestObject('Object Repository/Page_vc.ru  , , ,  ,/span_'))

WebUI.click(findTestObject('Object Repository/Page_vc.ru  , , ,  ,/button__1'))

WebUI.setText(findTestObject('Page_vc.ru  , , ,  ,/Логин'), 'nadyaguskova.flycode@yandex.ru')

WebUI.setText(findTestObject('Page_vc.ru  , , ,  ,/Пароль'), 'inspiration8N')

WebUI.click(findTestObject('Page_vc.ru  , , ,  ,/вход'))

