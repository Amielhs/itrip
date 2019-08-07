package cn.itrip.trade.config;

import org.springframework.stereotype.Component;

/**
 *  支付宝手机网站接入配置信息
 * @author hduser
 *
 */
@Component
public class AlipayConfig {

	/**
	 * 商户appid
	 */
	private String appID = "2016100100639170";
	/**
	 * 私钥 pkcs8格式的
	 */
	private String rsaPrivateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCbfdr5cRtqjz5l5OHVPt2m4gg+QUFnRLFCTE2JBTjtpb7yOSig20O08zl0Ua+u2qeQeJvHk6eT+Tc104DfgK6htd10wL2zISx7bWW6Z+OFgJvXvdKHpKyUFtOgWBnX7X3LRD45KBxtCOibGK5tPRV0zn4GYJa3vLmfJKqhqfWRb4b8QxTmVnOPnitKnhrqBVJEOGX95c9p+Jr2pyZLQiO+pF1d1beIj7mHgJVQegLfyKIapbYwev8ls+lJHZ1+pWZ/+pgbdmi4eop+jVCx+D9h7orGLZJhI3v6qZbgOPAYnYc6Y6DchgVSWOJhv5nUFvqGQVImBcGjs4dKQkeiz6unAgMBAAECggEBAIJlmS123TcPyZRJzdm3TsqU47TRpLels8GVm7A84PDq/qbDqH69YpptHtGdb2eDluJhQsKr4O0HInXRWVIV6F1U1tMCkBOYzmTz6UvZs8RRhl/2oIeAYfoO6oqdV47ta4D7SfNE4BHQVsE6gYy6nTPHt4hBmCOd8Uy0wyOwFHBRdn2b/90GXfiIJ4uS1fKApKqprn0qA3FF5tx/5hLRgvULfIIuQU8cSVNVnDNAB1jq/aUd9Ld2S8vhOcQeGJ3F7rGnM3YBXTEYAfT9lDFUTj6bchSZReF1crU/7nwf49Kf9+qtreDg/0KeB5FQBD9+zT+6lT9J28QpljQ/oEFUw4ECgYEA3vto+0iX+Pjo2EAFlSU4Hux+LebWI4nxseAA+9rlYSxQH2fwsIbnMo6CFzxf8QMioLgT48YpF24lnJrc3TC0iv5cgK779bLrM3LblRq66plS+2+5kEE+GRtRiRTTdcYTEGi5rShhs5+bHLDXG4xrreZ+sOnrmI/YPxd+Rcd2ciUCgYEAsoQVEAjif6li0p03aCgdgddmVWv7eMWGwsU78/Jzdr9Gq7/jEstDzVPsAxFcpcGVlDPcmeYO0NO9rB/xxJJdAzGfaL7h88r1IS07ydScNLk1wL+08myIDyD9aWgPQBrtFrRGMfC8zPLr7nXY9z1LskkfncKztX7aMLt+00XmDtsCgYBbFPLzAdoh9vqVqsEdBREBgLSh51K9PZGeiNOeDPH5WXJ5AaoNUW2K9y8ocp72AcPZRpfJSJ5sVa/DYnapW0XEKNZ8Mf31hNoSL+6F319OiMaesipoRF4rPz908S7XQstyvnRpyL7v8lgXxhx3wkoRxL8nYMW9kbRRQTVxJ2K4iQKBgH/UZwS5Z/+EerhYTgGuoBqG9Md8cHF1+F7mP10bIyVIKMH5wQ+HMEEKtDkqKI6lRYf/bxthCwDsbqifo09gg2wzD3RBI6mgjtG4A1UugsCaU2x3monxv6gdtnjRRAJihZ25b355ZajY1qtGBhxc7yR2ikY80tTHRlSZHmMJbYj7AoGAakm1Y9Llm8vfiUbPRpUheHi70r3dHqm/cDfSE4LsUj8QYgp27UBs2o6vu6RGTJo2riTR/UcrgjGvV0mZSmtfnT7Wurqw/LNv+xInRvxcEowP3rvj3e5iUqyRLgh8WfSruRS+gWxZYFVHTtqhTid9yuEjYzRrYz8wbJiHUi4O9AI=";
	/**
	 * 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	 */
	private String notifyUrl = "http://192.168.3.116:8083/trade/api/notify";
	/**
	 * 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	 */
	private String returnUrl = "http://192.168.3.116:8083/trade/api/return";
	/**
	 * 请求网关地址
	 */
	private String url = "https://openapi.alipaydev.com/gateway.do";
	/**
	 * 编码
	 */
	private String charset = "UTF-8";
	/**
	 * 返回格式
	 */
	private String format = "json";
	/**
	 * 支付宝公钥
	 */
	private String alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAm33a+XEbao8+ZeTh1T7dpuIIPkFBZ0SxQkxNiQU47aW+8jkooNtDtPM5dFGvrtqnkHibx5Onk/k3NdOA34CuobXddMC9syEse21lumfjhYCb173Sh6SslBbToFgZ1+19y0Q+OSgcbQjomxiubT0VdM5+BmCWt7y5nySqoan1kW+G/EMU5lZzj54rSp4a6gVSRDhl/eXPafia9qcmS0IjvqRdXdW3iI+5h4CVUHoC38iiGqW2MHr/JbPpSR2dfqVmf/qYG3ZouHqKfo1Qsfg/Ye6Kxi2SYSN7+qmW4DjwGJ2HOmOg3IYFUljiYb+Z1Bb6hkFSJgXBo7OHSkJHos+rpwIDAQAB";
	/**
	 * 日志记录目录
	 */
	private String logPath = "/logs";
	/**
	 * RSA2
	 */
	private String signType = "RSA2";
	
	///////////////////////////////////////////支付结果显示
	/**
	 * 支付成功跳转页面
	 */
	private String paymentSuccessUrl;
	/**
	 * 支付失败跳转页面
	 */
	private String paymentFailureUrl;
	///////////////////////////////////////////支付结果显示
	
	public String getAppID() {
		return appID;
	}
	public void setAppID(String appID) {
		this.appID = appID;
	}
	public String getRsaPrivateKey() {
		return rsaPrivateKey;
	}
	public void setRsaPrivateKey(String rsaPrivateKey) {
		this.rsaPrivateKey = rsaPrivateKey;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getReturnUrl() {
		return returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getAlipayPublicKey() {
		return alipayPublicKey;
	}
	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}
	public String getLogPath() {
		return logPath;
	}
	public void setLogPath(String logPath) {
		this.logPath = logPath;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
	
	public String getPaymentSuccessUrl() {
		return paymentSuccessUrl;
	}
	public void setPaymentSuccessUrl(String paymentSuccessUrl) {
		this.paymentSuccessUrl = paymentSuccessUrl;
	}
	public String getPaymentFailureUrl() {
		return paymentFailureUrl;
	}
	public void setPaymentFailureUrl(String paymentFailureUrl) {
		this.paymentFailureUrl = paymentFailureUrl;
	}
}
