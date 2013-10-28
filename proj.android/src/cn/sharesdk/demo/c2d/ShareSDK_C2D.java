/****************************************************************************
Copyright (c) 2010-2012 cocos2d-x.org

http://www.cocos2d-x.org

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
****************************************************************************/
package cn.sharesdk.demo.c2d;

import org.cocos2dx.lib.Cocos2dxActivity;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;

public class ShareSDK_C2D extends Cocos2dxActivity implements OnClickListener {
	private OnekeyShare oks;

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		Button btn = new Button(this);
		btn.setText("启动Share SDK");
		btn.setOnClickListener(this);
		FrameLayout.LayoutParams lpBtn = new FrameLayout.LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		lpBtn.gravity = Gravity.CENTER;
		btn.setLayoutParams(lpBtn);
		getContentView().addView(btn);
		
		ShareSDK.initSDK(this);
		oks = new OnekeyShare();
		oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
		oks.setAddress("12345678901");
		oks.setTitle("Share SDK on Cocos2d-x");
		oks.setTitleUrl("http://sharesdk.cn");
		oks.setText("老爷老爷~夫人生啦～～");
		oks.setImageUrl("http://img.appgo.cn/imgs/sharesdk/content/2013/07/25/1374723172663.jpg");
		oks.setUrl("http://www.sharesdk.cn");
		oks.setComment("就叫李、狗、蛋！");
		oks.setSite("http://sharesdk.cn");
		oks.setSiteUrl("http://sharesdk.cn");
		oks.setVenueName("Share SDK");
		oks.setVenueDescription("This is a beautiful place!");
		oks.setLatitude(23.056081f);
		oks.setLongitude(113.385708f);
	}
	
	public void onClick(View v) {
		oks.show(this);
	}
	
    static {
         System.loadLibrary("game");
    }
}
