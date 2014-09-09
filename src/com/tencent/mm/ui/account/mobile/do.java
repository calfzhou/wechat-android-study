package com.tencent.mm.ui.account.mobile;

import android.content.res.Resources;
import android.widget.TextView;
import com.tencent.mm.l;
import com.tencent.mm.n;

final class do
  implements Runnable
{
  do(dn paramdn)
  {
  }

  public final void run()
  {
    MobileVerifyUI.b(this.iVr.iVq);
    if (MobileVerifyUI.c(this.iVr.iVq) >= 0L)
    {
      TextView localTextView = this.iVr.iVq.iVb;
      Resources localResources = this.iVr.iVq.getResources();
      int i = l.bqP;
      int j = (int)MobileVerifyUI.c(this.iVr.iVq);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf((int)MobileVerifyUI.c(this.iVr.iVq));
      localTextView.setText(localResources.getQuantityString(i, j, arrayOfObject));
      return;
    }
    this.iVr.iVq.iVb.setVisibility(8);
    this.iVr.iVq.iVa.setVisibility(0);
    MobileVerifyUI.d(this.iVr.iVq);
    this.iVr.iVq.iVa.setEnabled(true);
    this.iVr.iVq.iVa.setText(this.iVr.iVq.getString(n.bSS));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.do
 * JD-Core Version:    0.6.2
 */