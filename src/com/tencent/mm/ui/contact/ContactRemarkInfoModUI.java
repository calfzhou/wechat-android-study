package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.c.a.mo;
import com.tencent.mm.model.y;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.protocal.a.sl;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.cn;
import com.tencent.mm.storage.co;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMClearEditText;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.cu;
import com.tencent.mm.ui.tools.l;
import java.io.File;
import java.util.List;

public class ContactRemarkInfoModUI extends MMActivity
  implements m
{
  public static InputFilter[] jyM = arrayOfInputFilter;
  private String cUj;
  private String dBi;
  private com.tencent.mm.storage.i elz;
  private ProgressDialog esI;
  private String ffo;
  private MMTagPanel glr;
  private List glt;
  private String hHU;
  private MMClearEditText jyN;
  private TextView jyO;
  private EditText jyP;
  private TextView jyQ;
  private TextView jyR;
  private TextView jyS;
  private TextView jyT;
  private ImageView jyU;
  private ImageView jyV;
  private TextView jyW;
  private View jyX;
  private Button jyY;
  private View jyZ;
  private int jza;
  private String jzb;
  private String jzc;
  private boolean jzd = false;
  private boolean jze = false;
  private boolean jzf = false;
  private boolean jzg = false;
  private boolean jzi = false;
  private cb jzj = new cb(this, (byte)0);
  private TextView jzk;
  private as jzl = new bj(this);
  private String username;

  static
  {
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new InputFilter.LengthFilter(50);
  }

  private void A(String paramString1, String paramString2, String paramString3)
  {
    com.tencent.mm.storage.i locali = com.tencent.mm.model.bg.qW().oT().ys(this.username);
    if ((locali != null) && ((int)locali.dhv > 0) && (com.tencent.mm.g.a.cv(locali.getType())))
    {
      this.elz.aT(paramString1);
      this.elz.bp(paramString2);
      this.elz.bq(paramString3);
      com.tencent.mm.model.bg.qW().oT().E(this.elz);
      com.tencent.mm.sdk.c.a.aGB().g(new mo());
    }
  }

  private void Cw(String paramString)
  {
    if (ap.jb(paramString));
    Bitmap localBitmap;
    do
    {
      File localFile;
      do
      {
        return;
        localFile = new File(paramString);
      }
      while (!localFile.exists());
      if (localFile.length() > 204800L)
      {
        com.tencent.mm.ui.base.e.o(this, getString(com.tencent.mm.n.bBk), null);
        return;
      }
      float f = com.tencent.mm.aq.a.getDensity(this);
      localBitmap = com.tencent.mm.sdk.platformtools.e.c(this.jzc, f);
    }
    while (localBitmap == null);
    this.jyS.setVisibility(8);
    this.jyV.setVisibility(8);
    this.jyU.setVisibility(0);
    this.jyU.setImageBitmap(localBitmap);
    this.jzd = true;
  }

  private String Cx(String paramString)
  {
    String str;
    if (!com.tencent.mm.a.c.ac(paramString))
      str = null;
    int i;
    do
    {
      return str;
      i = com.tencent.mm.sdk.platformtools.f.iM(paramString);
      str = com.tencent.mm.ag.c.yU().hk(this.username) + ".tmp";
      if (!com.tencent.mm.sdk.platformtools.i.a(paramString, 960, 960, Bitmap.CompressFormat.JPEG, 70, str))
      {
        z.e("!44@9DU/RFsdGl+78IVsLr7e0lB3zxHTejPIMP7oYqhJXgY=", "createThumbNail big pic fail");
        return null;
      }
    }
    while ((i == 0) || (com.tencent.mm.sdk.platformtools.i.a(str, i, Bitmap.CompressFormat.JPEG, 70, str)));
    z.e("!44@9DU/RFsdGl+78IVsLr7e0lB3zxHTejPIMP7oYqhJXgY=", "rotate big pic fail");
    return null;
  }

  private static void Ix()
  {
    com.tencent.mm.model.bg.qX().d(new com.tencent.mm.ab.k(5));
  }

  private void aWT()
  {
    if ((aWX()) || (aWY()) || (fz(false)))
    {
      eB(true);
      return;
    }
    eB(false);
  }

  private void aWU()
  {
    Bitmap localBitmap = com.tencent.mm.ag.c.yU().hn(this.username);
    if (localBitmap != null)
    {
      this.jyS.setVisibility(8);
      this.jyV.setVisibility(8);
      this.jyU.setVisibility(0);
      this.jyU.setImageBitmap(localBitmap);
    }
    this.jzd = true;
  }

  private boolean aWV()
  {
    String str = this.jyN.getText().toString().trim();
    z.i("!44@9DU/RFsdGl+78IVsLr7e0lB3zxHTejPIMP7oYqhJXgY=", "Set New RemarkName : " + str + ", Report kvStat, addContactScene = " + this.jza);
    com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.jza);
    localn.d(10448, arrayOfObject);
    switch (this.elz.getSource())
    {
    case 12:
    default:
    case 10:
    case 11:
    case 13:
    }
    com.tencent.mm.modelfriend.i locali;
    do
    {
      cn localcn = com.tencent.mm.model.bg.qW().oU().Ab(this.elz.getUsername());
      if (((localcn == null) || (ap.jb(localcn.field_encryptUsername))) && (!ap.jb(this.elz.jk())))
        localcn = com.tencent.mm.model.bg.qW().oU().Ab(this.elz.jk());
      if ((localcn != null) && (!ap.jb(localcn.field_encryptUsername)))
        com.tencent.mm.model.bg.qW().oU().Ac(localcn.field_encryptUsername);
      if (fz(false))
        break;
      return false;
      locali = az.wZ().gl(this.elz.getUsername());
    }
    while ((locali == null) || (ap.jb(locali.vw())));
    if (ap.jb(str))
      locali.vF();
    while (true)
    {
      az.wZ().a(locali.vu(), locali);
      break;
      locali.vE();
    }
    this.jzb = str;
    y.b(this.elz, str);
    return true;
  }

  private boolean aWW()
  {
    if (!aWX())
      return false;
    String str = this.jyP.getText().toString().trim();
    this.cUj = str;
    sl localsl = new sl();
    localsl.imq = this.username;
    localsl.hwQ = str;
    com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(54, localsl));
    return true;
  }

  private boolean aWX()
  {
    String str = this.jyP.getText().toString().trim();
    return ((this.cUj == null) || (!this.cUj.equals(str))) && ((!ap.jb(this.cUj)) || (!ap.jb(str)));
  }

  private boolean aWY()
  {
    return (!ap.jb(this.jzc)) || (this.jzi);
  }

  private void aWZ()
  {
    this.jzi = true;
    this.jyV.setVisibility(8);
    this.jyS.setVisibility(0);
    this.jyU.setVisibility(8);
    this.jyU.setImageBitmap(null);
    aWT();
  }

  private void aXa()
  {
    this.elz = com.tencent.mm.model.bg.qW().oT().ys(this.username);
    this.ffo = this.elz.jn();
    this.glt = g.ayc().nC(this.ffo);
    if (!ap.jb(this.ffo))
    {
      this.glr.setVisibility(0);
      this.jzk.setVisibility(8);
      this.glr.a(this.glt, this.glt);
      return;
    }
    this.glr.setVisibility(8);
    this.jzk.setVisibility(0);
  }

  private void fy(boolean paramBoolean)
  {
    if (this.jzf)
    {
      this.jyQ.setVisibility(8);
      if ((paramBoolean) && (ap.jb(this.cUj)))
      {
        this.jyR.setVisibility(0);
        this.jyZ.setVisibility(8);
      }
      while (true)
      {
        this.jyN.setVisibility(0);
        return;
        this.jyR.setVisibility(8);
        this.jyZ.setVisibility(0);
      }
    }
    this.jyQ.setVisibility(0);
    this.jyR.setVisibility(0);
    this.jyN.setVisibility(8);
    this.jyZ.setVisibility(8);
  }

  private boolean fz(boolean paramBoolean)
  {
    String str = this.jyN.getText().toString().trim();
    if (!paramBoolean)
      if (((this.jzb != null) && (this.jzb.equals(str))) || ((ap.jb(this.jzb)) && (ap.jb(str))));
    while (true)
    {
      return true;
      return false;
      if (((this.jzb == null) || (!this.jzb.equals(str))) && ((!ap.jb(this.jzb)) || (!ap.jb(str))));
      for (int i = 1; (i == 0) || ((str != null) && (str.equals(this.elz.iV()))); i = 0)
        return false;
    }
  }

  private void goBack()
  {
    boolean bool1 = aWY();
    boolean bool2 = fz(true);
    boolean bool3 = aWX();
    if ((bool1) || (bool2) || (bool3))
    {
      com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.bCJ), null, getString(com.tencent.mm.n.bCL), getString(com.tencent.mm.n.bCK), new br(this), new bs(this));
      return;
    }
    finish();
  }

  private static int v(CharSequence paramCharSequence)
  {
    return 200 - Math.round(w(paramCharSequence));
  }

  private static float w(CharSequence paramCharSequence)
  {
    float f = 0.0F;
    int i = 0;
    if (i < paramCharSequence.length())
    {
      if (ap.l(paramCharSequence.charAt(i)));
      for (f += 1.0F; ; f += 0.5F)
      {
        i++;
        break;
      }
    }
    return f;
  }

  protected final void DP()
  {
    this.jyO = ((TextView)findViewById(com.tencent.mm.i.anQ));
    this.jyQ = ((TextView)findViewById(com.tencent.mm.i.anY));
    this.jyR = ((TextView)findViewById(com.tencent.mm.i.anW));
    this.jyS = ((TextView)findViewById(com.tencent.mm.i.anX));
    this.jyN = ((MMClearEditText)findViewById(com.tencent.mm.i.anP));
    this.jyP = ((EditText)findViewById(com.tencent.mm.i.anN));
    this.jyU = ((ImageView)findViewById(com.tencent.mm.i.aLO));
    this.jyV = ((ImageView)findViewById(com.tencent.mm.i.aLP));
    this.jyT = ((TextView)findViewById(com.tencent.mm.i.baa));
    this.jyZ = findViewById(com.tencent.mm.i.anM);
    this.glr = ((MMTagPanel)findViewById(com.tencent.mm.i.anL));
    this.glr.jcx = false;
    this.jzk = ((TextView)findViewById(com.tencent.mm.i.anJ));
    this.jzk.setText(com.tencent.mm.n.bSU);
    this.glr.setOnClickListener(this.jzj);
    this.jzk.setOnClickListener(this.jzj);
    oP(com.tencent.mm.n.bCg);
    label533: com.tencent.mm.modelfriend.i locali;
    int i;
    if (!ap.jb(this.jzb))
    {
      this.jyN.append(com.tencent.mm.ar.b.f(this, ap.ja(this.jzb), (int)this.jyN.getTextSize()));
      this.jyQ.append(com.tencent.mm.ar.b.f(this, ap.ja(this.jzb), (int)this.jyQ.getTextSize()));
      this.jyP.append(ap.ja(this.cUj));
      if (!ap.jb(this.cUj))
      {
        this.jyR.setText(ap.ja(this.cUj));
        this.jyR.setTextColor(getResources().getColor(com.tencent.mm.f.OD));
      }
      this.jyQ.setOnClickListener(new bt(this));
      this.jyR.setOnClickListener(new bu(this));
      this.jyN.setFilters(jyM);
      this.jyN.addTextChangedListener(new bv(this));
      this.jyT.setText(v(this.jyP.getEditableText()));
      this.jyP.setOnFocusChangeListener(new bw(this));
      EditText localEditText = this.jyP;
      InputFilter[] arrayOfInputFilter = new InputFilter[1];
      arrayOfInputFilter[0] = new cc(this);
      localEditText.setFilters(arrayOfInputFilter);
      this.jyP.addTextChangedListener(new cd(this, (byte)0));
      if (ap.jb(this.dBi))
        break label817;
      this.jyS.setVisibility(8);
      this.jyU.setVisibility(0);
      if (com.tencent.mm.ag.c.yU().hl(this.username))
        break label810;
      com.tencent.mm.ag.c.yU().a(this.username, this.dBi, new bl(this));
      this.jyU.setOnClickListener(new bx(this));
      this.jyS.setOnClickListener(new by(this));
      locali = az.wZ().gl(this.elz.getUsername());
      if ((locali != null) && (!ap.jb(locali.vw())) && (!locali.vw().equals(this.jyN.getText().toString())))
        break label837;
      i = 0;
      label614: if ((i == 0) && (this.jza == 14) && (!ap.jb(this.hHU)) && (!this.hHU.equals(this.jyN.getText().toString())))
        break label944;
      label658: a(0, getString(com.tencent.mm.n.btB), new bz(this), cu.iMA);
      a(new ca(this));
      if (!ap.jb(this.jzb))
        break label1062;
      eB(true);
    }
    while (true)
    {
      this.jyV.setOnClickListener(new bk(this));
      if (!this.jzg)
      {
        this.jzf = true;
        fy(true);
        this.jyN.requestFocus();
      }
      return;
      this.jyN.append(com.tencent.mm.ar.b.f(this, ap.ja(this.elz.oc()), (int)this.jyN.getTextSize()));
      this.jyQ.append(com.tencent.mm.ar.b.f(this, ap.ja(this.elz.oc()), (int)this.jyQ.getTextSize()));
      break;
      label810: aWU();
      break label533;
      label817: this.jyS.setVisibility(0);
      this.jyU.setVisibility(8);
      break label533;
      label837: this.jyW = ((TextView)findViewById(com.tencent.mm.i.aES));
      this.jyX = findViewById(com.tencent.mm.i.aEQ);
      this.jyY = ((Button)findViewById(com.tencent.mm.i.aET));
      this.jyX.setVisibility(0);
      TextView localTextView2 = this.jyW;
      int k = com.tencent.mm.n.bCZ;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = locali.vw();
      localTextView2.setText(getString(k, arrayOfObject2));
      this.jyY.setOnClickListener(new bo(this, locali));
      i = 1;
      break label614;
      label944: this.jyW = ((TextView)findViewById(com.tencent.mm.i.aES));
      this.jyX = findViewById(com.tencent.mm.i.aEQ);
      this.jyY = ((Button)findViewById(com.tencent.mm.i.aET));
      this.jyX.setVisibility(0);
      TextView localTextView1 = this.jyW;
      int j = com.tencent.mm.n.bCY;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.hHU;
      localTextView1.setText(com.tencent.mm.ar.b.f(this, ap.ja(getString(j, arrayOfObject1)), (int)this.jyW.getTextSize()));
      this.jyY.setOnClickListener(new bp(this));
      break label658;
      label1062: eB(false);
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@9DU/RFsdGl+78IVsLr7e0lB3zxHTejPIMP7oYqhJXgY=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.esI != null)
    {
      this.esI.dismiss();
      this.esI = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.ui.base.e.o(this, getString(com.tencent.mm.n.btj), null);
      return;
    }
    if (paramx.getType() == 575)
    {
      File localFile = new File(this.jzc);
      if (localFile.exists())
        localFile.renameTo(new File(com.tencent.mm.ag.c.yU().hk(this.username)));
      String str = ((com.tencent.mm.ag.b)paramx).dBi;
      if (!ap.jb(str))
        this.dBi = str;
    }
    while (true)
    {
      boolean bool1 = aWV();
      boolean bool2 = aWW();
      if ((bool1) || (bool2))
        Ix();
      A(this.jzb, this.cUj, this.dBi);
      finish();
      return;
      if (paramx.getType() == 576)
      {
        this.jzc = null;
        this.dBi = null;
        this.jzd = false;
        this.elz = com.tencent.mm.model.bg.qW().oT().ys(this.username);
        this.elz.bq("");
        com.tencent.mm.model.bg.qW().oT().a(this.username, this.elz);
      }
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bdL;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.i("!44@9DU/RFsdGl+78IVsLr7e0lB3zxHTejPIMP7oYqhJXgY=", "onAcvityResult requestCode:%d, resultCode:%d", arrayOfObject);
    switch (paramInt1)
    {
    default:
    case 100:
    case 200:
    case 400:
    }
    do
    {
      String str1;
      do
      {
        do
        {
          String str2;
          do
          {
            return;
            str2 = bc.a(getApplicationContext(), paramIntent, com.tencent.mm.model.bg.qW().pa());
          }
          while (str2 == null);
          this.jzc = Cx(str2);
          Cw(this.jzc);
          this.jze = true;
          this.jzi = false;
          aWT();
          return;
        }
        while (paramIntent == null);
        str1 = l.b(getApplicationContext(), paramIntent, com.tencent.mm.model.bg.qW().pa());
      }
      while (str1 == null);
      this.jzc = Cx(str1);
      Cw(this.jzc);
      this.jze = true;
      this.jzi = false;
      aWT();
      return;
    }
    while ((paramIntent == null) || (!paramIntent.getBooleanExtra("response_delete", false)));
    aWZ();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.model.bg.qX().a(575, this);
    com.tencent.mm.model.bg.qX().a(576, this);
    this.jza = getIntent().getIntExtra("Contact_Scene", 9);
    this.hHU = getIntent().getStringExtra("Contact_RoomNickname");
    this.jzg = getIntent().getBooleanExtra("view_mode", false);
    this.username = getIntent().getStringExtra("Contact_User");
    if (ap.jb(this.username))
    {
      finish();
      return;
    }
    this.elz = com.tencent.mm.model.bg.qW().oT().ys(this.username);
    this.jzb = this.elz.ja();
    this.cUj = this.elz.jC();
    this.dBi = this.elz.jD();
    this.ffo = this.elz.jn();
    this.glt = g.ayc().nC(this.ffo);
    DP();
  }

  public void onDestroy()
  {
    com.tencent.mm.model.bg.qX().b(575, this);
    com.tencent.mm.model.bg.qX().b(576, this);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4)
    {
      goBack();
      return true;
    }
    return false;
  }

  protected void onPause()
  {
    com.tencent.mm.model.bg.qW().oT().b(this.jzl);
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    com.tencent.mm.model.bg.qW().oT().a(this.jzl);
    aXa();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI
 * JD-Core Version:    0.6.2
 */