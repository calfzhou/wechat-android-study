package com.tencent.mm.plugin.safedevice.ui;

import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.az;

final class ad
  implements az
{
  ad(SecurityAccountVerifyUI paramSecurityAccountVerifyUI)
  {
  }

  public final boolean kJ()
  {
    int i = ((Integer)SecurityAccountVerifyUI.a(this.fUC).getTag()).intValue();
    if (i <= 1)
    {
      SecurityAccountVerifyUI.b(this.fUC).setVisibility(0);
      SecurityAccountVerifyUI.a(this.fUC).setVisibility(8);
      return false;
    }
    int j = i - 1;
    SecurityAccountVerifyUI.a(this.fUC).setTag(Integer.valueOf(j));
    TextView localTextView = SecurityAccountVerifyUI.a(this.fUC);
    SecurityAccountVerifyUI localSecurityAccountVerifyUI = this.fUC;
    int k = n.cbS;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(j);
    localTextView.setText(localSecurityAccountVerifyUI.getString(k, arrayOfObject));
    if (SecurityAccountVerifyUI.a(this.fUC).getVisibility() != 0)
      SecurityAccountVerifyUI.a(this.fUC).setVisibility(0);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.ad
 * JD-Core Version:    0.6.2
 */