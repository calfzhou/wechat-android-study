package com.tencent.mm.ui.account.bind;

import android.content.res.Resources;
import android.widget.TextView;
import com.tencent.mm.l;

final class r
  implements Runnable
{
  r(BindMobileVerifyUI paramBindMobileVerifyUI)
  {
  }

  public final void run()
  {
    BindMobileVerifyUI.e(this.iTY);
    BindMobileVerifyUI.a(this.iTY, Integer.valueOf(-1 + BindMobileVerifyUI.e(this.iTY).intValue()));
    if (BindMobileVerifyUI.e(this.iTY).intValue() > 0)
    {
      TextView localTextView2 = BindMobileVerifyUI.c(this.iTY);
      Resources localResources2 = this.iTY.getResources();
      int j = l.bqP;
      int k = BindMobileVerifyUI.e(this.iTY).intValue();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = BindMobileVerifyUI.e(this.iTY);
      localTextView2.setText(localResources2.getQuantityString(j, k, arrayOfObject2));
      return;
    }
    TextView localTextView1 = BindMobileVerifyUI.c(this.iTY);
    Resources localResources1 = this.iTY.getResources();
    int i = l.bqP;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(0);
    localTextView1.setText(localResources1.getQuantityString(i, 0, arrayOfObject1));
    BindMobileVerifyUI.f(this.iTY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.r
 * JD-Core Version:    0.6.2
 */