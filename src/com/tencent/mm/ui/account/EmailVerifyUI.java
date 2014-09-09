package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.al;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMAutoSwitchEditTextView;
import com.tencent.mm.ui.base.e;

public class EmailVerifyUI extends MMActivity
  implements m
{
  private ProgressDialog dWT = null;
  private String fUt;
  private TextView iNS;
  private TextView iNT;
  private MMAutoSwitchEditTextView iNU;
  private Button iNV;
  private Button iNW;
  private String iNX;
  private String iNY;
  private String iNZ;
  private boolean iOa = false;
  private String verifyCode;

  private void goBack()
  {
    b.jE(this.fUt);
    finish();
  }

  protected final void DP()
  {
    oP(n.bYq);
    this.iNS = ((TextView)findViewById(i.aUB));
    String str = getString(n.bYd);
    this.iNS.setText(Html.fromHtml(str));
    this.iNT = ((TextView)findViewById(i.aqz));
    this.iNX = getIntent().getStringExtra("email_address");
    if (!ch.jb(this.iNX))
    {
      this.iNT.setText(this.iNX);
      this.iNZ = getIntent().getStringExtra("password");
      this.iNY = getIntent().getStringExtra("email_login_page");
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.iNX;
      arrayOfObject[1] = this.iNY;
      z.i("!32@/B4Tb64lLpIOS9lfUKA2PejJbq3tJ/Tl", "user register:email add:[%s], password not allowed to printf, login page:[%s]", arrayOfObject);
      this.iNU = ((MMAutoSwitchEditTextView)findViewById(i.agZ));
      this.iNU.a(new j(this));
      this.iNU.a(new k(this));
      this.iNW = ((Button)findViewById(i.aKm));
      this.iNW.setOnClickListener(new l(this));
      this.iNV = ((Button)findViewById(i.aGO));
      if ((!ch.jb(this.iNY)) && (!ch.jb(this.iNX)))
        break label305;
      this.iNV.setVisibility(8);
    }
    while (true)
    {
      a(new p(this));
      a(0, getString(n.btO), new q(this));
      eB(false);
      return;
      z.w("!32@/B4Tb64lLpIOS9lfUKA2PejJbq3tJ/Tl", "email add is null or nill");
      break;
      label305: this.iNV.setVisibility(0);
      this.iNV.setOnClickListener(new o(this));
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!32@/B4Tb64lLpIOS9lfUKA2PejJbq3tJ/Tl", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    this.iOa = false;
    if ((this.dWT != null) && (this.dWT.isShowing()))
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (paramx.getType() != 481)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramx.getType());
      z.e("!32@/B4Tb64lLpIOS9lfUKA2PejJbq3tJ/Tl", "error cgi type callback:[%d]", arrayOfObject3);
    }
    int i;
    label547: 
    do
      while (true)
      {
        return;
        i = ((al)paramx).sg();
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (i == 2)
          {
            b.jE("R200_900_email");
            Intent localIntent = new Intent(this, RegSetInfoUI.class);
            localIntent.putExtra("regsetinfo_ticket", ((al)paramx).wm());
            localIntent.putExtra("regsetinfo_user", this.iNX);
            localIntent.putExtra("regsetinfo_ismobile", 3);
            localIntent.putExtra("regsetinfo_NextStyle", ((al)paramx).ws());
            localIntent.putExtra("regsetinfo_pwd", this.iNZ);
            localIntent.putExtra("regsetinfo_bind_email", this.iNX);
            startActivity(localIntent);
            return;
          }
          if (i == 1)
          {
            b.jF(bg.qS() + "," + getClass().getName() + ",R22_resend_email_code_alert," + bg.eg("R22_resend_email_code_alert") + ",3");
            e.aw(this, getString(n.bYj));
            return;
          }
          z.e("!32@/B4Tb64lLpIOS9lfUKA2PejJbq3tJ/Tl", "err opcode");
          return;
        }
        int j;
        if (a.dWp.a(this, paramInt1, paramInt2, paramString))
          j = 1;
        while (j == 0)
        {
          if (i != 2)
            break label547;
          int m = n.bYr;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(paramInt1);
          arrayOfObject2[1] = Integer.valueOf(paramInt2);
          Toast.makeText(this, getString(m, arrayOfObject2), 0).show();
          return;
          switch (paramInt2)
          {
          default:
            j = 0;
            break;
          case -32:
            e.a(this, n.bYc, n.bYb, null);
            b.jF(bg.qS() + "," + getClass().getName() + ",R500_260," + bg.eg("R500_260") + ",3");
            j = 1;
            break;
          case -33:
            e.a(this, n.bYa, n.bYb, null);
            j = 1;
            break;
          case -34:
            Toast.makeText(this, n.bXZ, 0).show();
            j = 1;
          }
        }
      }
    while (i != 1);
    int k = n.bYi;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    Toast.makeText(this, getString(k, arrayOfObject1), 0).show();
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.boU;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
    this.fUt = b.DL();
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
    b.b(false, bg.qS() + "," + getClass().getName() + ",R500_200," + bg.eg("R500_200") + ",2");
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(481, this);
    b.b(true, bg.qS() + "," + getClass().getName() + ",R500_200," + bg.eg("R500_200") + ",1");
    b.jD("R500_200");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.EmailVerifyUI
 * JD-Core Version:    0.6.2
 */