package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;

final class hr
  implements View.OnClickListener
{
  hr(hd paramhd)
  {
  }

  public final void onClick(View paramView)
  {
    if ((paramView.getTag() != null) && ((paramView.getTag() instanceof Integer)))
    {
      int i = ((Integer)paramView.getTag()).intValue();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "reason : %d", arrayOfObject1);
      Intent localIntent = new Intent();
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      SharedPreferences localSharedPreferences = this.jtA.Bp(ak.aHi());
      this.jtA.agh();
      arrayOfObject2[1] = y.d(localSharedPreferences);
      localIntent.putExtra("rawUrl", String.format("http://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/hard_device_err__w_reason&errcode=%d&lang=%s#wechat_webview_type=1", arrayOfObject2));
      localIntent.putExtra("showShare", false);
      a.b(this.jtA.agh(), "webview", ".ui.tools.WebViewUI", localIntent);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hr
 * JD-Core Version:    0.6.2
 */