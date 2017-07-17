package com.bmob.fast;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import cn.bmob.v3.Bmob;

/**
 * 基类
 * @ClassName: BaseActivity
 * @Description: TODO
 * @author smile
 * @date 2014-5-20 上午9:55:34
 */
public class BaseActivity extends Activity {

	private String Bmob_AppId = "6a2e1fc1dce37227f236b3c144746f68";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// 初始化 Bmob SDK
		// 使用时请将第二个参数Application ID替换成你在Bmob服务器端创建的Application ID
		Bmob.initialize(this, Bmob_AppId);
	}

	Toast mToast;

	public void ShowToast(String text) {
		if (!TextUtils.isEmpty(text)) {
			if (mToast == null) {
				mToast = Toast.makeText(getApplicationContext(), text,
						Toast.LENGTH_SHORT);
			} else {
				mToast.setText(text);
			}
			mToast.show();
		}
	}
}
