package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMAutoCompleteTextView;
import com.tencent.mm.ui.base.e;
import java.util.Map;
import java.util.Set;

public class RegByEmailUI extends MMActivity
  implements m
{
  private static String[] iQj;
  private String cOq;
  private ProgressDialog dWT = null;
  private String fUt;
  private CheckBox hHm;
  private String iPI;
  private MMAutoCompleteTextView iQf;
  private EditText iQg;
  private String iQh;
  private Map iQi;

  private void goBack()
  {
    e.a(this, n.bXY, n.bYb, n.btQ, n.bsK, new el(this), null);
  }

  protected final void DP()
  {
    this.iQf = ((MMAutoCompleteTextView)findViewById(i.aLr));
    this.iQg = ((EditText)findViewById(i.aLx));
    this.hHm = ((CheckBox)findViewById(i.aeS));
    if (!ch.jb(this.iQh))
    {
      this.iQg.postDelayed(new ek(this), 500L);
      this.iQf.setText(this.iQh);
    }
    if (iQj != null)
    {
      c localc = new c(this, iQj, "@");
      this.iQf.BN("@");
      this.iQf.setDropDownAnchor(i.aLs);
      this.iQf.setDropDownVerticalOffset(this.iQf.getPaddingBottom());
      this.iQf.setAdapter(localc);
    }
    findViewById(i.aeR).setOnClickListener(new eo(this));
    this.hHm.setOnCheckedChangeListener(new ep(this));
    a(0, getString(n.btO), new eq(this));
    eB(false);
    this.iQf.addTextChangedListener(new er(this));
    this.iQg.addTextChangedListener(new es(this));
    this.iQg.setOnEditorActionListener(new et(this));
    this.iQg.setOnKeyListener(new eu(this));
    a(new ev(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!32@/B4Tb64lLpJbqVvJaJb5aA3mKG0QUtOk", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((this.dWT != null) && (this.dWT.isShowing()))
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (paramx.getType() != 481)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramx.getType());
      z.e("!32@/B4Tb64lLpJbqVvJaJb5aA3mKG0QUtOk", "error cgi type callback:[%d]", arrayOfObject2);
    }
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        b.jE("R500_200");
        Intent localIntent = new Intent(this, EmailVerifyUI.class);
        localIntent.putExtra("email_address", this.cOq);
        localIntent.putExtra("password", this.iPI);
        if ((this.iQi != null) && (!this.iQi.isEmpty()))
        {
          String[] arrayOfString = this.cOq.split("@");
          if ((arrayOfString != null) && (arrayOfString.length == 2))
          {
            String str2 = arrayOfString[1];
            localIntent.putExtra("email_login_page", (String)this.iQi.get(str2));
          }
        }
        startActivity(localIntent);
        return;
      }
      int i;
      if (com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString))
        i = 1;
      while (i == 0)
      {
        if (ch.jb(paramString))
          break label525;
        Map localMap = com.tencent.mm.sdk.platformtools.x.bB(paramString, "e");
        if ((localMap == null) || (localMap.size() <= 0))
          break label525;
        String str1 = (String)localMap.get(".e.Content");
        if (ch.jb(str1))
          break label525;
        e.o(this, str1, getString(n.bYb));
        return;
        switch (paramInt2)
        {
        default:
          i = 0;
          break;
        case -7:
          b.jF(bg.qS() + "," + getClass().getName() + ",R20_email_duplicate_confirm," + bg.eg("R20_email_duplicate_confirm") + ",3");
          e.a(this, n.bYl, n.bYb, n.bYn, n.bYm, new en(this), null);
          i = 1;
          break;
        case -111:
          e.b(this, n.bYe, n.bYb);
          i = 1;
          break;
        case -34:
          Toast.makeText(this, n.bXZ, 0).show();
          i = 1;
          break;
        case -75:
          e.b(this, n.bsD, n.bXV);
          i = 1;
        }
      }
    }
    label525: int j = n.bYi;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    Toast.makeText(this, getString(j, arrayOfObject1), 0).show();
  }

  protected final int getLayoutId()
  {
    return k.blx;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getString(n.bYk);
    if (com.tencent.mm.protocal.a.hrq)
      str = getString(n.age) + getString(n.bsA);
    Bt(str);
    com.tencent.mm.plugin.a.a.dWp.hY();
    this.iQh = f.N(this);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.iQh;
    z.i("!32@/B4Tb64lLpJbqVvJaJb5aA3mKG0QUtOk", "get google account:[%s]", arrayOfObject);
    this.iQi = com.tencent.mm.plugin.accountsync.b.a.dWC.ag(this);
    if ((this.iQi != null) && (!this.iQi.isEmpty()))
    {
      iQj = new String[this.iQi.size()];
      this.iQi.keySet().toArray(iQj);
    }
    this.fUt = b.DL();
    DP();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
    bg.qX().b(481, this);
    b.b(false, bg.qS() + "," + getClass().getName() + ",R500_100," + bg.eg("R500_100") + ",2");
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(481, this);
    b.b(true, bg.qS() + "," + getClass().getName() + ",R500_100," + bg.eg("R500_100") + ",1");
    b.jD("R500_100");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.RegByEmailUI
 * JD-Core Version:    0.6.2
 */