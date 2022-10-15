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

WebUI.callTestCase(findTestCase('android/app_demo/steps/generic/open_app'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('android/app_demo/steps/login/llenar_form_login'), [('USUARIO') : USUARIO, ('PASSWORD') : PASSWORD], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('android/app_demo/steps/login/click_ingresar'), [:], FailureHandling.STOP_ON_FAILURE)

String mensaje = WebUI.callTestCase(findTestCase('android/app_demo/steps/login/aceptar_alert_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('android/app_demo/steps/login/validar_login'), [('MENSAJE_ESPERADO') : 'Bienvenido: JOSY', ('MENSAJE_ACTUAL') : mensaje], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('android/app_demo/steps/home/seleccionar_menu'), [('MENU') : MENU], FailureHandling.STOP_ON_FAILURE)
