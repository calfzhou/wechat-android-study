package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ap;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.j;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.mobile.MobileInputUI;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.bindmobile.FindMContactAlertUI;
import com.tencent.mm.ui.bindmobile.FindMContactIntroUI;
import java.io.File;
import java.util.LinkedList;
import java.util.Map;

public class RegSetInfoUI extends MMActivity
  implements com.tencent.mm.o.m
{
  private ProgressDialog dWT = null;
  private String fAX;
  private Button fAm;
  private int fsH = 0;
  private String hjI;
  private SecurityImage iMR = null;
  private com.tencent.mm.pluginsdk.e.a iPu;
  private EditText iQW;
  private boolean iQw = false;
  private EditText iRJ;
  private String iRK;
  private String iRL;
  private int iRM;
  private String iRN;
  private TextView iRO;
  private View iRP;
  private boolean iRQ = false;
  private ImageView iRR;
  private int iRS = 3;
  private LinkedList iRT = new LinkedList();
  private ImageView iRU;
  private ImageView iRV;
  private ProgressBar iRW;
  private String iRX = "";
  private ImageView iRY;
  private View iRZ;
  private TextView iSa;
  private String iSb = null;
  private boolean iSc = false;
  private cn iSd;
  private View iSe;
  private boolean iSf = false;
  private ay iSg = new ay(Looper.myLooper(), new ia(this), true);

  private boolean aQL()
  {
    return (this.iRV.getVisibility() == 8) || (this.iSc);
  }

  private void aQM()
  {
    String str = this.iQW.getText().toString().trim();
    Button localButton = this.fAm;
    if (!ch.jb(str));
    for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }

  private boolean aQN()
  {
    return (0x1 & this.iRS) > 0;
  }

  private boolean aQO()
  {
    return (0x2 & this.iRS) > 0;
  }

  private boolean aQP()
  {
    return this.fsH == 1;
  }

  private boolean aQQ()
  {
    return this.fsH == 2;
  }

  private boolean aQR()
  {
    return this.fsH == 3;
  }

  private int aQS()
  {
    int i = 2;
    if (aQP())
      i = 4;
    while ((aQQ()) || (!aQR()))
      return i;
    return 6;
  }

  private String aQT()
  {
    if (aQP())
      return this.iRK;
    if (aQR())
      return this.iRL;
    return this.iRN;
  }

  private void afq()
  {
    XF();
    if (aQP())
    {
      e.a(this, getString(com.tencent.mm.n.bZf), "", new iy(this), new ja(this));
      return;
    }
    if (aQQ())
    {
      e.a(this, getString(com.tencent.mm.n.bZe), "", new jb(this), new jc(this));
      return;
    }
    if (this.fsH == 0);
    for (int i = 1; i != 0; i = 0)
    {
      e.a(this, getString(com.tencent.mm.n.bZe), "", new jd(this), new je(this));
      return;
    }
    if (aQR())
    {
      e.a(this, getString(com.tencent.mm.n.bZe), "", new jf(this), new jg(this));
      return;
    }
    b.jE("R200_100");
    Intent localIntent = new Intent(this, MobileInputUI.class);
    localIntent.putExtra("mobile_input_purpose", 2);
    localIntent.addFlags(67108864);
    startActivity(localIntent);
    finish();
  }

  private boolean j(int paramInt1, int paramInt2, String paramString)
  {
    com.tencent.mm.pluginsdk.e.n localn = new com.tencent.mm.pluginsdk.e.n(paramInt1, paramInt2, paramString);
    if (this.iPu.a(this, localn))
      return true;
    if (com.tencent.mm.plugin.a.a.dWp.a(aPI(), paramInt1, paramInt2, paramString))
      return true;
    switch (paramInt2)
    {
    default:
      return false;
    case -10:
    case -7:
      e.b(this, com.tencent.mm.n.bXU, com.tencent.mm.n.bXV);
      return true;
    case -75:
      e.b(this, com.tencent.mm.n.bsD, com.tencent.mm.n.bXV);
      return true;
    case -100:
      bg.re();
      ActionBarActivity localActionBarActivity = aPI();
      if (TextUtils.isEmpty(j.aGQ()));
      for (String str = com.tencent.mm.aq.a.p(aPI(), com.tencent.mm.n.bQZ); ; str = j.aGQ())
      {
        e.a(localActionBarActivity, str, aPI().getString(com.tencent.mm.n.buo), new iw(this), new ix(this));
        return true;
      }
    case -48:
    }
    com.tencent.mm.d.a locala = com.tencent.mm.d.a.ct(paramString);
    if (locala != null)
      locala.a(this, null, null);
    while (true)
    {
      return true;
      e.o(this, getString(com.tencent.mm.n.bZk), "");
    }
  }

  private void w(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (ch.jb(this.iRJ.getText().toString().trim()))
      paramBoolean1 = false;
    ImageView localImageView1 = this.iRV;
    int i;
    ImageView localImageView2;
    if (paramBoolean2)
    {
      i = com.tencent.mm.h.aaM;
      localImageView1.setImageResource(i);
      localImageView2 = this.iRV;
      if (!paramBoolean1)
        break label93;
    }
    label93: for (int j = 0; ; j = 8)
    {
      localImageView2.setVisibility(j);
      boolean bool = false;
      if (paramBoolean1)
      {
        bool = false;
        if (paramBoolean2)
          bool = true;
      }
      this.iSc = bool;
      return;
      i = com.tencent.mm.h.aaJ;
      break;
    }
  }

  protected final void DP()
  {
    this.iSe = findViewById(com.tencent.mm.i.aIc);
    this.iRZ = findViewById(com.tencent.mm.i.aOC);
    this.iRR = ((ImageView)findViewById(com.tencent.mm.i.aOB));
    this.iQW = ((EditText)findViewById(com.tencent.mm.i.aLv));
    this.iSa = ((TextView)findViewById(com.tencent.mm.i.aOE));
    this.iRJ = ((EditText)findViewById(com.tencent.mm.i.aLy));
    this.iRO = ((TextView)findViewById(com.tencent.mm.i.afN));
    this.iRP = findViewById(com.tencent.mm.i.aLM);
    this.iRU = ((ImageView)findViewById(com.tencent.mm.i.aGj));
    this.iRV = ((ImageView)findViewById(com.tencent.mm.i.aZB));
    this.iRW = ((ProgressBar)findViewById(com.tencent.mm.i.aIy));
    this.iRY = ((ImageView)findViewById(com.tencent.mm.i.aOD));
    this.fAm = ((Button)findViewById(com.tencent.mm.i.aGg));
    this.iRU.setVisibility(8);
    this.iRV.setVisibility(8);
    this.iRW.setVisibility(8);
    this.iRY.setVisibility(8);
    this.iQw = false;
    this.iSc = false;
    View localView1 = this.iRZ;
    int i;
    int j;
    label253: int k;
    if (aQN())
    {
      i = 0;
      localView1.setVisibility(i);
      View localView2 = this.iRP;
      if (!aQO())
        break label513;
      j = 0;
      localView2.setVisibility(j);
      TextView localTextView = this.iRO;
      boolean bool = aQO();
      k = 0;
      if (!bool)
        break label520;
      label279: localTextView.setVisibility(k);
      if ((!aQN()) || (!aQO()))
        break label527;
      this.iSa.setText(getString(com.tencent.mm.n.bZj));
    }
    while (true)
    {
      bg.qQ().a(new iz(this));
      this.iQW.addTextChangedListener(new jh(this));
      this.fAm.setOnClickListener(new ji(this));
      this.iRJ.setOnFocusChangeListener(new jj(this));
      this.iRJ.addTextChangedListener(new jk(this));
      a(new jm(this));
      this.iQW.setOnEditorActionListener(new jn(this));
      this.iQW.setOnKeyListener(new ib(this));
      this.iRJ.setOnEditorActionListener(new ic(this));
      this.iRJ.setOnKeyListener(new id(this));
      this.iRR.setOnClickListener(new ie(this));
      File localFile = new File(com.tencent.mm.compatible.g.h.dOS);
      if (!localFile.exists())
        localFile.mkdir();
      aQM();
      return;
      i = 8;
      break;
      label513: j = 8;
      break label253;
      label520: k = 8;
      break label279;
      label527: if ((aQN()) && (!aQO()))
        this.iSa.setText(getString(com.tencent.mm.n.bZh));
      else if ((!aQN()) && (aQO()))
        this.iSa.setText(getString(com.tencent.mm.n.bZi));
      else
        this.iSa.setText(getString(com.tencent.mm.n.bZg));
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!32@9DU/RFsdGl8JYFGpESyRAL2xk59FhSfi", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    String str1;
    String str2;
    int i1;
    String str3;
    boolean bool1;
    String str8;
    String str10;
    String str4;
    String str5;
    if (paramx.getType() == 126)
    {
      bg.qX().b(126, this);
      if (this.dWT != null)
      {
        this.dWT.dismiss();
        this.dWT = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.iSb = null;
        str1 = aQT();
        str2 = ((ae)paramx).zB();
        i1 = ((ae)paramx).zC();
        str3 = ((ae)paramx).zD();
        Map localMap = com.tencent.mm.sdk.platformtools.x.bB(str3, "wording");
        bool1 = false;
        if (localMap == null)
          break label1513;
        str8 = (String)localMap.get(".wording.switch");
        if (!ch.jb(str8))
          break label528;
        bool1 = true;
        if (!bool1)
          break label1513;
        String str9 = (String)localMap.get(".wording.title");
        boolean bool2 = ch.jb(str9);
        str10 = null;
        if (!bool2)
          str10 = str9;
        String str11 = (String)localMap.get(".wording.desc");
        if (ch.jb(str11))
          break label1503;
        str4 = str11;
        str5 = str10;
      }
    }
    while (true)
    {
      z.d("!32@9DU/RFsdGl8JYFGpESyRAL2xk59FhSfi", "mShowStyleContactUploadWordings , %s", new Object[] { str3 });
      bg.rf();
      bg.S(true);
      if (this.iQw)
      {
        String str6 = com.tencent.mm.compatible.g.h.dOS + "temp.avatar";
        String str7 = com.tencent.mm.compatible.g.h.dOS + "temp.avatar.hd";
        new File(str6).renameTo(new File(str7));
        com.tencent.mm.a.c.deleteFile(str6);
        com.tencent.mm.sdk.platformtools.i.a(str7, 96, 96, Bitmap.CompressFormat.JPEG, 90, str6, true);
        q localq = new q(this, com.tencent.mm.compatible.g.h.dOS + "temp.avatar");
        localq.a(new ii(this, paramx, str1, str2, bool1, str5, str4, i1), new ij(this, paramx, str1, str2, bool1, str5, str4, i1));
        label452: if (paramInt2 != -6)
          break label874;
        if (this.iMR != null)
          break label847;
        this.iMR = com.tencent.mm.ui.applet.m.a(aPI(), com.tencent.mm.n.bZc, false, ((ae)paramx).wB(), ((ae)paramx).wC(), "", new ik(this, paramx), null, new in(this), new io(this, paramx));
      }
      label528: label847: label874: 
      do
      {
        do
        {
          do
          {
            return;
            int i2 = ch.xy(str8);
            if (i2 == 0)
            {
              bool1 = false;
              break;
            }
            bool1 = false;
            if (i2 != 1)
              break;
            bool1 = true;
            break;
            this.fAX = ((ae)paramx).zA();
            bf.dkH.y("login_user_name", str1);
            if ((str2 != null) && (str2.contains("0")))
            {
              b.jE("R300_100_phone");
              Intent localIntent2;
              if (!bool1)
                localIntent2 = new Intent(this, FindMContactIntroUI.class);
              while (true)
              {
                localIntent2.addFlags(67108864);
                localIntent2.putExtra("regsetinfo_ticket", this.fAX);
                localIntent2.putExtra("regsetinfo_NextStep", str2);
                localIntent2.putExtra("regsetinfo_NextStyle", i1);
                Intent localIntent3 = com.tencent.mm.plugin.a.a.dWo.k(this);
                localIntent3.addFlags(67108864);
                localIntent3.putExtra("LauncherUI.enter_from_reg", true);
                MMWizardActivity.b(this, localIntent2, localIntent3);
                finish();
                break;
                localIntent2 = new Intent(this, FindMContactAlertUI.class);
                localIntent2.putExtra("alert_title", str5);
                localIntent2.putExtra("alert_message", str4);
              }
            }
            Intent localIntent1 = com.tencent.mm.plugin.a.a.dWo.k(this);
            localIntent1.addFlags(67108864);
            localIntent1.putExtra("LauncherUI.enter_from_reg", true);
            startActivity(localIntent1);
            b.jF(bg.qS() + "," + getClass().getName() + ",R200_900_phone," + bg.eg("R200_900_phone") + ",4");
            finish();
            break label452;
            this.iMR.b(false, ((ae)paramx).wB(), ((ae)paramx).wC(), "");
            return;
          }
          while (j(paramInt1, paramInt2, paramString));
          if (paramx.getType() == 429)
          {
            bg.qX().b(429, this);
            if (this.dWT != null)
            {
              this.dWT.dismiss();
              this.dWT = null;
            }
            this.iRW.setVisibility(8);
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              this.iSb = null;
              int k = ((ap)paramx).wA();
              Object[] arrayOfObject3 = new Object[1];
              arrayOfObject3[0] = Integer.valueOf(k);
              z.d("!32@9DU/RFsdGl8JYFGpESyRAL2xk59FhSfi", "UsernameRet %d", arrayOfObject3);
              if ((k == -14) || (k == -10) || (k == -7))
              {
                LinkedList localLinkedList = ((ap)paramx).wz();
                com.tencent.mm.d.a locala = com.tencent.mm.d.a.ct(paramString);
                if (locala != null)
                  this.iRO.setText(locala.desc);
                this.iRT.clear();
                if ((localLinkedList != null) && (localLinkedList.size() > 0))
                {
                  if (localLinkedList.size() > 3);
                  String[] arrayOfString;
                  for (int m = 3; ; m = localLinkedList.size())
                  {
                    arrayOfString = new String[m];
                    for (int n = 0; n < m; n++)
                    {
                      arrayOfString[n] = ((vt)localLinkedList.get(n)).getString();
                      this.iRT.add(arrayOfString[n]);
                    }
                  }
                  if (this.iSf)
                  {
                    if (this.iSd != null)
                    {
                      this.iSd.dismiss();
                      this.iSd = null;
                    }
                    this.iSd = ee.a(this, this.iSe, arrayOfString, new iu(this, arrayOfString));
                  }
                }
                w(true, true);
                return;
              }
              if (ch.jb(this.iRJ.getText().toString().trim()))
              {
                w(false, false);
                return;
              }
              w(true, false);
              this.iRO.setText(getString(com.tencent.mm.n.bZl));
              if (this.iSd != null)
              {
                this.iSd.dismiss();
                this.iSd = null;
              }
              this.iRJ.postDelayed(new ip(this), 50L);
              return;
            }
            if (paramInt2 == -6)
            {
              if (this.iMR == null)
              {
                this.iMR = com.tencent.mm.ui.applet.m.a(aPI(), com.tencent.mm.n.bZc, false, ((ap)paramx).wB(), ((ap)paramx).wC(), "", new iq(this, paramx), null, new is(this), new it(this, paramx));
                return;
              }
              this.iMR.b(false, ((ap)paramx).wB(), ((ap)paramx).wC(), "");
              return;
            }
            w(true, true);
          }
        }
        while (j(paramInt1, paramInt2, paramString));
        if (paramInt1 == 8)
        {
          int j = com.tencent.mm.n.bKj;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(paramInt1);
          arrayOfObject2[1] = Integer.valueOf(paramInt2);
          this.iSb = getString(j, arrayOfObject2);
          Toast.makeText(this, this.iSb, 0).show();
          return;
        }
      }
      while ((paramInt1 == 0) && (paramInt2 == 0));
      int i = com.tencent.mm.n.bKW;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      arrayOfObject1[1] = Integer.valueOf(paramInt2);
      Toast.makeText(this, getString(i, arrayOfObject1), 0).show();
      return;
      label1503: str5 = str10;
      str4 = null;
      continue;
      label1513: str4 = null;
      str5 = null;
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.blG;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.i("!32@9DU/RFsdGl8JYFGpESyRAL2xk59FhSfi", "onAcvityResult requestCode:%d, resultCode:%d", arrayOfObject);
    Bitmap localBitmap = com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramIntent);
    if (localBitmap != null)
    {
      this.iRR.setImageBitmap(localBitmap);
      this.iQw = true;
      this.iRY.setVisibility(0);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getString(com.tencent.mm.n.bZm);
    if (com.tencent.mm.protocal.a.hrq)
      str = getString(com.tencent.mm.n.age) + getString(com.tencent.mm.n.bsA);
    Bt(str);
    com.tencent.mm.plugin.a.a.dWp.hY();
    this.iRK = getIntent().getStringExtra("regsetinfo_user");
    this.iRL = getIntent().getStringExtra("regsetinfo_bind_email");
    this.fAX = getIntent().getStringExtra("regsetinfo_ticket");
    this.hjI = getIntent().getStringExtra("regsetinfo_pwd");
    this.iRN = getIntent().getStringExtra("regsetinfo_binduin");
    if (!ch.jb(this.iRN))
      this.iRM = com.tencent.mm.a.k.ai(this.iRN);
    this.fsH = getIntent().getExtras().getInt("regsetinfo_ismobile", 0);
    this.iRQ = getIntent().getExtras().getBoolean("regsetinfo_isForce", false);
    this.iRS = getIntent().getIntExtra("regsetinfo_NextControl", 3);
    DP();
    if (this.fsH == 1)
    {
      b.b(true, bg.qS() + "," + getClass().getName() + ",R200_900_phone," + bg.eg("R200_900_phone") + ",1");
      b.jD("R200_900_phone");
    }
    while (true)
    {
      this.iSf = false;
      this.iPu = new com.tencent.mm.pluginsdk.e.a();
      return;
      if (this.fsH == 2)
      {
        b.b(true, bg.qS() + "," + getClass().getName() + ",R4_QQ," + bg.eg("R4_QQ") + ",1");
        b.jD("R4_QQ");
      }
      else if (this.fsH == 3)
      {
        b.b(true, bg.qS() + "," + getClass().getName() + ",R200_900_email," + bg.eg("R200_900_email") + ",1");
        b.jD("R200_900_email");
      }
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.fsH == 1)
      b.b(false, bg.qS() + "," + getClass().getName() + ",R200_900_phone," + bg.eg("R200_900_phone") + ",2");
    while (true)
    {
      if (this.iPu != null)
        this.iPu.close();
      return;
      if (this.fsH == 2)
        b.b(false, bg.qS() + "," + getClass().getName() + ",R4_QQ," + bg.eg("R4_QQ") + ",2");
      else if (this.fsH == 3)
        b.b(false, bg.qS() + "," + getClass().getName() + ",R200_900_email," + bg.eg("R200_900_email") + ",2");
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      afq();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onResume()
  {
    super.onResume();
    this.iQW.postDelayed(new im(this), 500L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.RegSetInfoUI
 * JD-Core Version:    0.6.2
 */