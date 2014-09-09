package com.tencent.mm.ui.bindmobile;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
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
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.a.je;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.friend.FindMContactAddUI;

public class BindMContactVerifyUI extends MMWizardActivity
  implements m
{
  private String cTZ;
  private cr dWq = null;
  private SharedPreferences dkI;
  private EditText iTQ;
  private Button iTT;
  private boolean iTU = false;
  private boolean iTW = false;
  private TextView iUA;
  private boolean jip = false;
  private boolean jjY = false;
  private boolean jkk = false;
  private boolean jkm = false;
  private int status;

  protected final void DP()
  {
    this.cTZ = ((String)com.tencent.mm.model.bg.qW().oQ().get(4097));
    this.iTQ = ((EditText)findViewById(i.aje));
    this.iTU = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.jjY = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.iTW = getIntent().getBooleanExtra("BIND_FOR_QQ_REG", false);
    this.jkm = getIntent().getBooleanExtra("BIND_FIND_ME_BY_MOBILE", false);
    this.jkk = getIntent().getBooleanExtra("is_bind_for_change_mobile", false);
    this.jip = getIntent().getBooleanExtra("KEnterFromBanner", false);
    Button localButton1 = (Button)findViewById(i.ajb);
    if ((this.cTZ == null) || (this.cTZ.equals("")))
      this.cTZ = ((String)com.tencent.mm.model.bg.qW().oQ().get(6));
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new ai(this);
    this.iTQ.setFilters(arrayOfInputFilter);
    this.iTT = ((Button)findViewById(i.ajg));
    this.iUA = ((TextView)findViewById(i.ajc));
    boolean bool = this.jkm;
    Button localButton2;
    if (!bool)
    {
      this.status = (0x200 | this.status);
      this.dkI.edit().putBoolean("settings_find_me_by_mobile", bool).commit();
      z.d("!44@/B4Tb64lLpJ7jzBwffYq6PuWyEoGP5lTzagzi32Hu+w=", "Bind mobile update = " + this.status);
      TextView localTextView = this.iUA;
      int i = com.tencent.mm.n.bww;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.cTZ;
      localTextView.setText(getString(i, arrayOfObject));
      localButton1.setOnClickListener(new aj(this));
      a(new al(this));
      localButton2 = this.iTT;
      if (!com.tencent.mm.z.b.gX(this.cTZ))
        break label404;
    }
    label404: for (int j = 0; ; j = 8)
    {
      localButton2.setVisibility(j);
      this.iTT.setOnClickListener(new am(this));
      return;
      this.status = (0xFFFFFDFF & this.status);
      break;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!44@/B4Tb64lLpJ7jzBwffYq6PuWyEoGP5lTzagzi32Hu+w=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((((ak)paramx).sg() != 2) && (((ak)paramx).sg() != 19));
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
        if ((((ak)paramx).sg() == 2) || (((ak)paramx).sg() == 19))
        {
          if (this.iTU)
          {
            if (!com.tencent.mm.model.x.pM())
            {
              mk localmk = new mk();
              localmk.cPe.cPf = true;
              localmk.cPe.cPg = true;
              com.tencent.mm.sdk.c.a.aGB().g(localmk);
            }
            aQl();
            Intent localIntent = new Intent();
            localIntent.addFlags(67108864);
            com.tencent.mm.plugin.a.a.dWo.d(this, localIntent);
            return;
          }
          if (this.iTW)
          {
            aQl();
            startActivity(new Intent(this, FindMContactAddUI.class));
            return;
          }
          int k;
          int m;
          if ((0x200 & this.status) > 0)
          {
            k = 1;
            com.tencent.mm.model.bg.qW().oQ().set(7, Integer.valueOf(this.status));
            je localje = new je();
            localje.iad = 8;
            if (k == 0)
              break label428;
            m = 1;
            label285: localje.iae = m;
            com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(23, localje));
            com.tencent.mm.plugin.a.a.dWp.hT();
            if (!this.jjY)
            {
              getApplicationContext();
              com.tencent.mm.modelfriend.c.vp();
            }
            if (this.jkk)
              com.tencent.mm.ui.base.e.aw(this, getString(com.tencent.mm.n.bwg));
            if (this.jip)
            {
              if (!this.jjY)
                break label434;
              com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
              Object[] arrayOfObject3 = new Object[2];
              arrayOfObject3[0] = Integer.valueOf(3);
              arrayOfObject3[1] = Integer.valueOf(3);
              localn2.d(11002, arrayOfObject3);
            }
          }
          while (true)
          {
            j(this, new Intent(this, BindMContactStatusUI.class));
            return;
            k = 0;
            break;
            label428: m = 2;
            break label285;
            label434: com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(1);
            arrayOfObject2[1] = Integer.valueOf(2);
            localn1.d(11002, arrayOfObject2);
          }
        }
      }
      else
      {
        com.tencent.mm.d.a locala1 = com.tencent.mm.d.a.ct(paramString);
        if (locala1 != null)
        {
          locala1.a(this, null, null);
          return;
        }
        int i;
        if (com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString))
          i = 1;
        while (i == 0)
        {
          int j = com.tencent.mm.n.bwP;
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = Integer.valueOf(paramInt1);
          arrayOfObject1[1] = Integer.valueOf(paramInt2);
          Toast.makeText(this, getString(j, arrayOfObject1), 0).show();
          return;
          switch (paramInt2)
          {
          default:
            i = 0;
            break;
          case -34:
            Toast.makeText(this, com.tencent.mm.n.bwp, 0).show();
            i = 1;
            break;
          case -43:
            Toast.makeText(this, com.tencent.mm.n.bwm, 0).show();
            i = 1;
            break;
          case -214:
            com.tencent.mm.d.a locala2 = com.tencent.mm.d.a.ct(paramString);
            if (locala2 != null)
              locala2.a(this, null, null);
            i = 1;
            break;
          case -41:
            Toast.makeText(this, com.tencent.mm.n.bwo, 0).show();
            i = 1;
            break;
          case -35:
            Toast.makeText(this, com.tencent.mm.n.bwn, 0).show();
            i = 1;
            break;
          case -36:
            Toast.makeText(this, com.tencent.mm.n.bwr, 0).show();
            i = 1;
            break;
          case -32:
            com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.bwR, com.tencent.mm.n.ajf, null);
            i = 1;
            break;
          case -33:
            com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.bwQ, com.tencent.mm.n.ajf, null);
            i = 1;
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
    com.tencent.mm.model.bg.qX().a(132, this);
    oP(com.tencent.mm.n.bwF);
    this.dkI = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.status = com.tencent.mm.model.x.pK();
    DP();
  }

  public void onDestroy()
  {
    com.tencent.mm.model.bg.qX().b(132, this);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      aQl();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.BindMContactVerifyUI
 * JD-Core Version:    0.6.2
 */