package com.tencent.mm.ui.account.bind;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.c.a.mk;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.friend.FindMContactAddUI;
import java.util.Timer;

public class BindMobileVerifyUI extends MMWizardActivity
  implements com.tencent.mm.o.m
{
  private String cTZ;
  private cr dWq = null;
  private Timer gXT;
  private boolean iTM = false;
  private EditText iTQ;
  private TextView iTR;
  private TextView iTS;
  private Button iTT;
  private boolean iTU = false;
  private boolean iTV = false;
  private boolean iTW = false;
  private Integer iTX = Integer.valueOf(15);
  private BindWordingContent iTw;
  private int iTx;
  private boolean iTy;
  private boolean iTz;

  private void aQY()
  {
    if (this.gXT != null)
    {
      this.gXT.cancel();
      this.gXT = null;
    }
  }

  protected final void DP()
  {
    this.cTZ = ((String)bg.qW().oQ().get(4097));
    this.iTQ = ((EditText)findViewById(i.aje));
    this.iTR = ((TextView)findViewById(i.ajd));
    this.iTS = ((TextView)findViewById(i.aiY));
    this.iTU = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.iTV = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.iTW = getIntent().getBooleanExtra("BIND_FOR_QQ_REG", false);
    Button localButton1 = (Button)findViewById(i.ajb);
    if ((this.cTZ == null) || (this.cTZ.equals("")))
      this.cTZ = ((String)bg.qW().oQ().get(6));
    if ((this.cTZ != null) && (this.cTZ.length() > 0))
    {
      this.iTR.setVisibility(0);
      this.iTR.setText(this.cTZ);
    }
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new l(this);
    this.iTQ.setFilters(arrayOfInputFilter);
    this.iTT = ((Button)findViewById(i.ajg));
    localButton1.setVisibility(8);
    TextView localTextView = this.iTS;
    Resources localResources = getResources();
    int i = com.tencent.mm.l.bqP;
    int j = this.iTX.intValue();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.iTX;
    localTextView.setText(localResources.getQuantityString(i, j, arrayOfObject));
    if (this.gXT == null)
    {
      this.gXT = new Timer();
      q localq = new q(this);
      if (this.gXT != null)
        this.gXT.schedule(localq, 1000L, 1000L);
    }
    a(0, getString(n.btO), new m(this));
    a(new o(this));
    Button localButton2 = this.iTT;
    if (com.tencent.mm.z.b.gX(this.cTZ));
    for (int k = 0; ; k = 8)
    {
      localButton2.setVisibility(k);
      this.iTT.setOnClickListener(new p(this));
      return;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    boolean bool1 = true;
    z.i("!44@/B4Tb64lLpK6HdUbIC2x6qaEPwT50EygfoEOXu4tUeY=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (((ak)paramx).sg() != 2);
    while (true)
    {
      return;
      if (this.dWq != null)
      {
        this.dWq.dismiss();
        this.dWq = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (((ak)paramx).sg() == 2)
        {
          if (this.iTU)
          {
            if (!com.tencent.mm.model.x.pM())
            {
              mk localmk = new mk();
              localmk.cPe.cPf = bool1;
              localmk.cPe.cPg = bool1;
              com.tencent.mm.sdk.c.a.aGB().g(localmk);
            }
            aQl();
            Intent localIntent2 = new Intent();
            localIntent2.addFlags(67108864);
            com.tencent.mm.plugin.a.a.dWo.d(this, localIntent2);
            return;
          }
          if (this.iTW)
          {
            aQl();
            startActivity(new Intent(this, FindMContactAddUI.class));
            return;
          }
          if (this.iTM)
          {
            boolean bool3;
            if (!this.iTy)
            {
              bool3 = bool1;
              if (this.iTz)
                break label256;
            }
            while (true)
            {
              BindMobileStatusUI.a(this, bool3, bool1);
              exit(-1);
              return;
              bool3 = false;
              break;
              label256: bool1 = false;
            }
          }
          if (!this.iTV)
          {
            getApplicationContext();
            com.tencent.mm.modelfriend.c.vp();
          }
          Intent localIntent1 = new Intent(this, BindMobileStatusUI.class);
          localIntent1.putExtra("kstyle_bind_wording", this.iTw);
          localIntent1.putExtra("kstyle_bind_recommend_show", this.iTx);
          localIntent1.putExtra("Kfind_friend_by_mobile_flag", this.iTy);
          localIntent1.putExtra("Krecom_friends_by_mobile_flag", this.iTz);
          j(this, localIntent1);
        }
      }
      else
      {
        boolean bool2;
        if (com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString))
          bool2 = bool1;
        while (!bool2)
        {
          int i = n.bwP;
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Integer.valueOf(paramInt1);
          arrayOfObject[bool1] = Integer.valueOf(paramInt2);
          Toast.makeText(this, getString(i, arrayOfObject), 0).show();
          return;
          switch (paramInt2)
          {
          default:
            bool2 = false;
            break;
          case -34:
            Toast.makeText(this, n.bwp, 0).show();
            bool2 = bool1;
            break;
          case -43:
            Toast.makeText(this, n.bwm, 0).show();
            bool2 = bool1;
            break;
          case -214:
            com.tencent.mm.d.a locala = com.tencent.mm.d.a.ct(paramString);
            if (locala != null)
              locala.a(this, null, null);
            bool2 = bool1;
            break;
          case -41:
            Toast.makeText(this, n.bwo, 0).show();
            bool2 = bool1;
            break;
          case -35:
            Toast.makeText(this, n.bwn, 0).show();
            bool2 = bool1;
            break;
          case -36:
            Toast.makeText(this, n.bwr, 0).show();
            bool2 = bool1;
            break;
          case -32:
            com.tencent.mm.ui.base.e.a(this, n.bwR, n.ajf, null);
            bool2 = bool1;
            break;
          case -33:
            com.tencent.mm.ui.base.e.a(this, n.bwQ, n.ajf, null);
            bool2 = bool1;
          }
        }
      }
    }
  }

  protected final int getLayoutId()
  {
    return k.bbJ;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qX().a(132, this);
    oP(n.bwF);
    this.iTw = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.iTx = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.iTy = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
    this.iTz = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
    this.iTM = getIntent().getBooleanExtra("is_bind_for_chatroom_upgrade", false);
    DP();
  }

  public void onDestroy()
  {
    bg.qX().b(132, this);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
      return true;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onStop()
  {
    aQY();
    super.onStop();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.BindMobileVerifyUI
 * JD-Core Version:    0.6.2
 */