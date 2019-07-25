/**
 * 判断 一个选择器文本框 是否填写了值
 *
 * @param selector
 * @returns {Boolean}
 */
function isInputEmpty(selector) {
	var selectorInput = $(selector);

	// 选择器上面的
	var str = $.trim(selectorInput.val());

	if (str != undefined && str != null && str != "" && str != "undefined") {
		return false;
	} else {
		return true;
	}
}

/*
 * check date 适用 2000-5-5这种格式，日期在1900-0-0到2099-12-31之间 2000-05-05 也可
 */
function isDate(date) {
	var datePattern = /^(19|20)\d{2}-(1[0-2]|0?[1-9])-(0?[1-9]|[1-2][0-9]|3[0-1])$/;
	return datePattern.test(date);
}

/*
 * check Email
 */
function isEmail(email) {
	var emailPattern = /.+@.+\.[a-zA-Z]{2,4}$/;
	return emailPattern.test(email);
}

/*
 * check phone
 */
function isPhone(phone) {
	var phonePattern = /^1[3|4|5|7|8][0-9]{9}$/;
	return phonePattern.test(phone);
}

/**
 * 判断字符是不是空
 *
 * @param str
 */
function isNotNullOrEmpty(str) {
	if (str != undefined && str != null && str != "" && str != "undefined") {
		return true;
	} else {
		return false;
	}
}

/**
 * 判断字符是不是空
 *
 * @param str
 */
function isNullOrEmpty(str) {
	return !isNotNullOrEmpty(str)
}

/**
 * 判断字符是不是string
 * @param obj
 * @returns {Boolean}
 */
function isString(obj) {
	return typeof obj === "string" || obj instanceof String;
}

// 获取cookie值
function getCookie(NameOfCookie) {
	// 首先我们检查下cookie是否存在.
	// 如果不存在则document.cookie的长度为0
	if (document.cookie.length > 0) {

		// 如果begin的变量值得到的是-1那么说明不存在
		begin = document.cookie.indexOf(NameOfCookie + "=");
		if (begin != -1) {

			// 说明存在我们的cookie.
			begin += NameOfCookie.length + 1;// cookie值的初始位置
			end = document.cookie.indexOf(";", begin);// 结束位置
			if (end == -1)
				end = document.cookie.length;//没有;则end为字符串结束位置
			return unescape(document.cookie.substring(begin, end));
		}
	}
	return null;
}

/**判断字符中是否包含有特殊字符：*/
function containSpecial(s){
    var containSpecial = /^[(\ )(\~)(\!)(\@)(\#)(\$)(\%)(\^)(\&)(\*)(\()(\))(\-)(\_)(\+)(\=)(\[)(\])(\{)(\})(\|)(\\)(\;)(\:)(\')(\")(\,)(\.)(\/)(\<)(\>)(\?)(\)]+$/;
    return containSpecial.test(s);
}

// 格式化数字的显示形式：若数值大于1000，则显示为nk
function formatNumber(num) {
	(num > 1000) && (num = Number(num / 1000).toFixed(1) + "k");
	return num;
}

function CheckPassWord(password) {//必须为字母加数字且长度不小于8位
	   var str = password;
	    if (str == null || str.length <8) {
	        return false;
	    }
	    var reg1 = new RegExp(/^[0-9A-Za-z]+$/);
	    if (!reg1.test(str)) {
	        return false;
	    }
	    var reg = new RegExp(/[A-Za-z].*[0-9]|[0-9].*[A-Za-z]/);
	    if (reg.test(str)) {
	        return true;
	    } else {
	        return false;
	    }
	}