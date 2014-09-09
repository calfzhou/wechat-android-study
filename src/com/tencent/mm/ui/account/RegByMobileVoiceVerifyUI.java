package com.tencent.mm.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;

public class RegByMobileVoiceVerifyUI extends MMActivity
  implements m
{
  private String cTZ;
  private TextView ekU;
  private String fUt;
  private String iOO;
  private String iRh;
  private ai iRj;
  private ak iRk;
  private int iRl = 0;

  protected final void DP()
  {
    oP(n.bxb);
    a(new gu(this));
    this.ekU = ((TextView)findViewById(i.azK));
    Button localButton = (Button)findViewById(i.ajh);
    this.iOO = RegByMobileVoiceVerifySelectUI.BE(this.cTZ);
    this.ekU.setText(this.iOO);
    this.iRh = com.tencent.mm.z.b.gY(this.cTZ);
    findViewById(i.aAk).setOnClickListener(new gv(this));
    localButton.setOnClickListener(new gw(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!56@/B4Tb64lLpLrFBPJPItazQLmw58ZW6uLRZUPo5zDQ6fb1Al5E0gSMg==", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
  }

  protected final int getLayoutId()
  {
    return k.bbL;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 != 10000) || (paramIntent == null))
      return;
    this.iOO = paramIntent.getStringExtra("voice_verify_language");
    this.iRh = paramIntent.getStringExtra("voice_verify_code");
    this.ekU.setText(this.iOO);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.cTZ = getIntent().getExtras().getString("bindmcontact_mobile");
    this.iRl = getIntent().getExtras().getInt("voice_verify_type");
    if ((this.iRl == 0) || (this.iRl == 2) || (this.iRl == 3))
      bg.qX().a(145, this);
    while (true)
    {
      this.fUt = com.tencent.mm.plugin.a.b.DL();
      DP();
      return;
      if ((this.iRl == 4) || (this.iRl == 1))
        bg.qX().a(132, this);
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    bg.qX().b(132, this);
    bg.qX().b(145, this);
    if ((this.iRl == 0) || (this.iRl == 2) || (this.iRl == 3))
      com.tencent.mm.plugin.a.b.b(false, bg.qS() + "," + getClass().getName() + ",R200_500," + bg.eg("R200_500") + ",2");
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      com.tencent.mm.plugin.a.b.jE(this.fUt);
      XF();
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onResume()
  {
    super.onResume();
    if ((this.iRl == 0) || (this.iRl == 2) || (this.iRl == 3))
    {
      com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",R200_500," + bg.eg("R200_500") + ",1");
      com.tencent.mm.plugin.a.b.jD("R200_500");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.RegByMobileVoiceVerifyUI
 * JD-Core Version:    0.6.2
 */