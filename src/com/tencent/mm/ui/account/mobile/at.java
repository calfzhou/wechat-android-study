package com.tencent.mm.ui.account.mobile;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.bd;
import java.util.Map;

final class at
  implements bd
{
  at(MobileInputUI paramMobileInputUI)
  {
  }

  public final void BD(String paramString)
  {
    if (ch.jb(paramString))
    {
      this.iUs.eB(false);
      this.iUs.iQu.setEnabled(false);
    }
    while ((this.iUs.iOS.getText() != null) && (this.iUs.iOS.getText().toString().length() > 0) && (this.iUs.iPb) && ((!MobileInputUI.b(this.iUs)) || (this.iUs.hHm.isChecked())))
    {
      this.iUs.eB(true);
      this.iUs.iQu.setEnabled(true);
      return;
      if (paramString.length() > 1)
      {
        String str1 = paramString.substring(1);
        String str2 = (String)this.iUs.iOZ.get(str1);
        if (ch.jb(str2))
        {
          this.iUs.iOU.setText(this.iUs.getString(n.bSD));
          this.iUs.iPb = false;
        }
        else
        {
          if ((this.iUs.iPa.get(this.iUs.iOU.getText()) == null) || (!((String)this.iUs.iPa.get(this.iUs.iOU.getText())).equals(str1)))
            this.iUs.iOU.setText(str2);
          this.iUs.iPb = true;
        }
      }
      else
      {
        this.iUs.iOU.setText(this.iUs.getString(n.bSF));
      }
    }
    this.iUs.eB(false);
    this.iUs.iQu.setEnabled(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.at
 * JD-Core Version:    0.6.2
 */