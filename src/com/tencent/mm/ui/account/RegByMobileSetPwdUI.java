package com.tencent.mm.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;

public class RegByMobileSetPwdUI extends SetPwdUI
{
  private String hHl = null;
  private TextView iRc;
  private TextView iRd;
  private View iRe;
  private TextView iRf;

  protected final void DP()
  {
    oP(n.bYN);
    this.iRd = ((TextView)findViewById(com.tencent.mm.i.aUt));
    this.iRe = findViewById(com.tencent.mm.i.aec);
    this.iRc = ((TextView)findViewById(com.tencent.mm.i.aLC));
    this.iRf = ((TextView)findViewById(com.tencent.mm.i.aed));
    if ((this.hHl != null) && (this.hHl.length() > 0))
      this.iRc.setText(this.hHl);
    if (bg.qW().oD() == 0)
    {
      this.iRe.setVisibility(8);
      TextView localTextView1 = (TextView)findViewById(com.tencent.mm.i.aHE);
      TextView localTextView2 = (TextView)findViewById(com.tencent.mm.i.ans);
      float f1 = this.iRf.getPaint().measureText(this.iRf.getText().toString());
      float f2 = localTextView1.getPaint().measureText(localTextView1.getText().toString());
      float f3 = localTextView2.getPaint().measureText(localTextView2.getText().toString());
      float f4 = Math.max(Math.max(f1, f2), f3);
      this.iRf.setWidth((int)f4);
      localTextView1.setWidth((int)f4);
      localTextView1.setWidth((int)f4);
      return;
    }
    this.iRe.setVisibility(0);
    String str1 = x.pH();
    if (ch.jb(str1))
    {
      str1 = x.pG();
      if (com.tencent.mm.storage.i.yd(str1))
        str1 = null;
    }
    String str2;
    String str3;
    String str4;
    String str5;
    if (ch.jb(str1))
    {
      str2 = (String)bg.qW().oQ().get(6);
      str3 = (String)bg.qW().oQ().get(5);
      if (!ch.jb(str2))
        if (ch.ji(str2).booleanValue())
        {
          new be();
          if (!str2.startsWith("+"))
            break label483;
          str4 = str2.replace("+", "");
          str5 = be.AT(str4);
          if (str5 != null)
            str4 = str4.substring(str5.length());
        }
    }
    while (true)
    {
      String str6 = be.bC(str5, str4);
      this.iRf.setText(n.cfU);
      this.iRd.setText(str6);
      this.iRc.setText(n.bYP);
      break;
      if (!ch.jb(str3))
      {
        this.iRd.setText(str3);
        this.iRf.setText(n.cft);
        this.iRc.setText(n.bYO);
        break;
      }
      this.iRe.setVisibility(8);
      break;
      this.iRf.setText(n.chv);
      this.iRd.setText(str1);
      break;
      label483: str4 = str2;
      str5 = "86";
    }
  }

  protected final String aQG()
  {
    return ((EditText)findViewById(com.tencent.mm.i.aLH)).getText().toString();
  }

  protected final String aQH()
  {
    return ((EditText)findViewById(com.tencent.mm.i.aLG)).getText().toString();
  }

  protected final int getLayoutId()
  {
    return k.blE;
  }

  protected final boolean k(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      finish();
      return true;
    }
    return j(paramInt1, paramInt2, paramString);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.hHl = getIntent().getStringExtra("kintent_hint");
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  protected final void pe(int paramInt)
  {
    switch (gs.iQm[(paramInt - 1)])
    {
    default:
      return;
    case 1:
      com.tencent.mm.ui.base.e.b(this, n.bYI, n.bYK);
      return;
    case 2:
      com.tencent.mm.ui.base.e.b(this, n.bYJ, n.bYK);
      return;
    case 3:
      com.tencent.mm.ui.base.e.b(this, n.cnJ, n.bti);
      return;
    case 4:
    }
    com.tencent.mm.ui.base.e.b(this, n.cnL, n.bti);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.RegByMobileSetPwdUI
 * JD-Core Version:    0.6.2
 */