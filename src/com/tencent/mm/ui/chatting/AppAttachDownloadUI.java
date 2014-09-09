package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.a.c;
import com.tencent.mm.c.a.gt;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.model.app.ae;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.ShowImageUI;
import java.io.File;

public class AppAttachDownloadUI extends MMActivity
  implements m, aj, al
{
  private long cDM;
  private String cJr;
  private ar cMM;
  private ae eBv;
  private ProgressBar eBw;
  private com.tencent.mm.o.n eBx;
  private Button eGN;
  private Button eSA;
  private View eSF;
  private ImageView fFI;
  private ImageView fFJ;
  private int hvl;
  private TextView iUA;
  private boolean iWI;
  private boolean jlA = false;
  private boolean jlB = true;
  private int jlC = 5000;
  private LinearLayout jlD;
  private LinearLayout jlE;
  private View jlv;
  private TextView jlw;
  private TextView jlx;
  private String jly;
  private boolean jlz = false;
  private String mediaId;
  private String rI;

  private void aUk()
  {
    com.tencent.mm.pluginsdk.model.app.a locala = bf.GP().uU(this.mediaId);
    if (locala == null)
      com.tencent.mm.pluginsdk.model.app.s.b(this.cDM, this.cJr, null);
    while (new File(locala.field_fileFullPath).exists())
      return;
    com.tencent.mm.pluginsdk.model.app.s.b(this.cDM, this.cJr, null);
  }

  private void aUl()
  {
    switch (this.hvl)
    {
    case 1:
    case 3:
    case 4:
    case 5:
    default:
      this.eSA.setVisibility(0);
      this.eSF.setVisibility(8);
      this.jlv.setVisibility(8);
    case 0:
    case 6:
    case 2:
      do
      {
        do
          return;
        while (!aUm());
        if (ch.xH(this.jly))
        {
          aUn();
          return;
        }
        String str = getMimeType();
        this.iUA.setVisibility(0);
        this.eSF.setVisibility(8);
        this.jlv.setVisibility(8);
        this.eGN.setVisibility(8);
        this.jlx.setVisibility(0);
        if (this.rI.equals(""))
          this.jlx.setText(getString(com.tencent.mm.n.bUF));
        while ((str == null) || (str.equals("")))
        {
          this.eSA.setVisibility(8);
          this.iUA.setText(getString(com.tencent.mm.n.bEm));
          return;
          this.jlx.setText(this.rI);
        }
        this.eSA.setVisibility(0);
        this.iUA.setText(getString(com.tencent.mm.n.bEn));
        return;
      }
      while (!aUm());
      aUn();
      return;
    case 7:
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("App_MsgId", this.cDM);
    setResult(-1, localIntent);
    finish();
  }

  private boolean aUm()
  {
    com.tencent.mm.pluginsdk.model.app.a locala = bf.GP().uU(this.mediaId);
    if (locala == null);
    while (c.ac(locala.field_fileFullPath))
      return true;
    this.jlD.setVisibility(8);
    this.jlE.setVisibility(0);
    return false;
  }

  private void aUn()
  {
    com.tencent.mm.pluginsdk.model.app.a locala = bf.GP().uU(this.mediaId);
    Intent localIntent = new Intent(this, ShowImageUI.class);
    localIntent.putExtra("key_message_id", this.cMM.kk());
    localIntent.putExtra("key_image_path", locala.field_fileFullPath);
    localIntent.putExtra("key_favorite", true);
    startActivity(localIntent);
    finish();
  }

  private String getMimeType()
  {
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(this.cJr);
    String str1 = localb.dQX;
    String str2 = null;
    if (str1 != null)
    {
      int i = localb.dQX.length();
      str2 = null;
      if (i > 0)
        str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(localb.dQX);
    }
    if ((str2 == null) || (str2.length() == 0))
    {
      z.w("!44@/B4Tb64lLpKndQxFPEClveSib8MV3PX8lfhyBMAVEhc=", "getMimeType fail, not a built-in mimetype, use \"*/{fileext}\" instead");
      str2 = "*/" + localb.dQX;
    }
    return str2;
  }

  private void init()
  {
    oP(com.tencent.mm.n.bEw);
    this.cDM = getIntent().getLongExtra("app_msg_id", -1L);
    boolean bool1;
    if (this.cDM == -1L)
      bool1 = false;
    while (!bool1)
    {
      finish();
      return;
      this.cMM = bg.qW().oV().cV(this.cDM);
      if ((this.cMM == null) || (this.cMM.kk() == 0L) || (this.cMM.getContent() == null))
      {
        bool1 = false;
      }
      else
      {
        this.iWI = y.dc(this.cMM.kt());
        this.cJr = this.cMM.getContent();
        if ((this.iWI) && (this.cMM.jK() == 0))
        {
          String str = this.cMM.getContent();
          if ((this.iWI) && (str != null))
            str = bw.en(str);
          this.cJr = str;
        }
        com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(this.cJr);
        if (localb == null)
        {
          bool1 = false;
        }
        else
        {
          this.hvl = localb.type;
          this.mediaId = localb.dQY;
          this.rI = ap.ja(localb.title);
          this.jly = ap.ja(localb.dQX).toLowerCase();
          com.tencent.mm.pluginsdk.model.app.a locala = bf.GP().uU(localb.dQY);
          if ((locala != null) && (new File(locala.field_fileFullPath).exists()) && (locala.field_offset > 0L));
          for (this.jlA = true; ; this.jlA = false)
          {
            int i = 0;
            if (locala != null)
            {
              File localFile2 = new File(locala.field_fileFullPath);
              boolean bool2 = localFile2.exists();
              i = 0;
              if (bool2)
              {
                boolean bool3 = localFile2.length() < locala.field_totalLen;
                i = 0;
                if (!bool3)
                  i = 1;
              }
            }
            if (i == 0)
              break label380;
            bool1 = com.tencent.mm.pluginsdk.ui.tools.a.a(this, locala.field_fileFullPath, this.jly, 1);
            break;
          }
          label380: bool1 = true;
        }
      }
    }
    File localFile1 = new File(com.tencent.mm.compatible.g.h.dOJ);
    if (!localFile1.exists())
      localFile1.mkdir();
    bf.GP().g(this);
    DP();
  }

  protected final void DP()
  {
    this.fFI = ((ImageView)findViewById(i.aqp));
    this.eSF = findViewById(i.aqk);
    this.eBw = ((ProgressBar)findViewById(i.aqj));
    this.fFJ = ((ImageView)findViewById(i.aqn));
    this.eGN = ((Button)findViewById(i.aqa));
    this.eSA = ((Button)findViewById(i.aqi));
    this.jlv = findViewById(i.aqb);
    this.iUA = ((TextView)findViewById(i.aqg));
    this.jlw = ((TextView)findViewById(i.aqc));
    this.jlx = ((TextView)findViewById(i.aqf));
    this.jlD = ((LinearLayout)findViewById(i.aqh));
    this.jlE = ((LinearLayout)findViewById(i.aAp));
    this.fFJ.setOnClickListener(new e(this));
    this.eGN.setOnClickListener(new f(this));
    this.eSA.setOnClickListener(new g(this));
    com.tencent.mm.pluginsdk.model.app.a locala;
    int i;
    switch (this.hvl)
    {
    case 1:
    case 3:
    case 5:
    default:
      this.fFI.setBackgroundResource(com.tencent.mm.h.UC);
      a(new a(this));
      a(0, com.tencent.mm.h.QL, new b(this));
      this.jlz = false;
      locala = bf.GP().uU(this.mediaId);
      if ((locala == null) || (!new File(locala.field_fileFullPath).exists()))
      {
        i = 0;
        label333: if (i == 0)
          break label462;
        this.jlz = true;
        aUl();
      }
      break;
    case 2:
    case 4:
    case 6:
    case 0:
    case 7:
    }
    while (true)
    {
      return;
      this.fFI.setBackgroundResource(com.tencent.mm.h.UB);
      break;
      this.fFI.setBackgroundResource(com.tencent.mm.h.UD);
      break;
      this.fFI.setBackgroundResource(com.tencent.mm.pluginsdk.model.s.E(this.jly, true));
      break;
      if (ch.xH(this.jly))
      {
        this.fFI.setBackgroundResource(com.tencent.mm.h.UB);
        break;
      }
      this.fFI.setBackgroundResource(com.tencent.mm.h.UC);
      break;
      if ((locala.sl()) || ((this.cMM.jK() == 1) && (locala.field_isUpload)))
      {
        i = 1;
        break label333;
      }
      i = 0;
      break label333;
      label462: if ((this.cMM.kD() != 1) && ((locala == null) || (!new File(locala.field_fileFullPath).exists())))
      {
        this.jlD.setVisibility(8);
        this.jlE.setVisibility(0);
        return;
      }
      if (!this.jlz)
      {
        this.eBx = new d(this);
        switch (this.hvl)
        {
        case 1:
        case 3:
        case 4:
        case 5:
        default:
        case 0:
        case 6:
        case 7:
        case 2:
        }
        while ((!this.jlz) && (!this.jlA))
        {
          aUk();
          this.eSF.setVisibility(0);
          this.eGN.setVisibility(8);
          this.jlv.setVisibility(0);
          this.eBv = new ae(this.cDM, this.mediaId, this.eBx);
          bg.qX().d(this.eBv);
          return;
          if (this.jlA)
          {
            this.eGN.setVisibility(0);
            label673: this.eSF.setVisibility(8);
            this.jlv.setVisibility(8);
            this.eSA.setVisibility(8);
            this.iUA.setVisibility(0);
            this.jlx.setVisibility(0);
            if (!this.rI.equals(""))
              break label811;
            this.jlx.setText(getString(com.tencent.mm.n.bUF));
            label742: String str = getMimeType();
            if ((str != null) && (!str.equals("")))
              break label825;
            this.iUA.setText(getString(com.tencent.mm.n.bEm));
          }
          while (ch.xH(this.jly))
          {
            this.iUA.setVisibility(8);
            break;
            this.eGN.setVisibility(8);
            break label673;
            label811: this.jlx.setText(this.rI);
            break label742;
            label825: this.iUA.setText(getString(com.tencent.mm.n.bEn));
          }
          if (this.jlA)
            this.eGN.setVisibility(0);
          while (true)
          {
            this.eSF.setVisibility(8);
            this.jlv.setVisibility(8);
            this.eSA.setVisibility(8);
            this.jlx.setVisibility(8);
            this.iUA.setVisibility(0);
            this.iUA.setText(getString(com.tencent.mm.n.bEn));
            break;
            this.eGN.setVisibility(8);
          }
          this.eSF.setVisibility(0);
          this.jlv.setVisibility(0);
          this.eGN.setVisibility(8);
          this.eSA.setVisibility(8);
          this.jlx.setVisibility(8);
          this.iUA.setVisibility(8);
          this.eBv = new ae(this.cDM, this.mediaId, this.eBx);
          aUk();
          bg.qX().d(this.eBv);
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != 221);
    while ((paramInt1 == 0) && (paramInt2 == 0))
      return;
    if (paramInt2 == -5103059)
    {
      this.jlE.setVisibility(0);
      this.jlD.setVisibility(8);
      return;
    }
    this.eSF.setVisibility(8);
    this.eGN.setVisibility(0);
    this.jlv.setVisibility(8);
    z.e("!44@/B4Tb64lLpKndQxFPEClveSib8MV3PX8lfhyBMAVEhc=", "onSceneEnd, download fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
  }

  public final void a(String paramString, ao paramao)
  {
    com.tencent.mm.pluginsdk.model.app.a locala = bf.GP().uU(this.mediaId);
    long l1;
    long l2;
    int j;
    if (locala != null)
    {
      l1 = locala.field_totalLen;
      l2 = locala.field_offset;
      TextView localTextView = this.jlw;
      int i = com.tencent.mm.n.bEo;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = ap.Z(l2);
      arrayOfObject[1] = ap.Z(l1);
      localTextView.setText(getString(i, arrayOfObject));
      boolean bool = locala.field_totalLen < 0L;
      j = 0;
      if (bool)
        break label234;
    }
    while (true)
    {
      z.v("!44@/B4Tb64lLpKndQxFPEClveSib8MV3PX8lfhyBMAVEhc=", "attach progress:" + j + " offset:" + l2 + " totallen:" + l1);
      this.eBw.setProgress(j);
      if (j >= 100)
      {
        this.jlz = true;
        if (locala != null)
        {
          Toast.makeText(this, getString(com.tencent.mm.n.bEv) + " : " + locala.field_fileFullPath.replaceFirst(com.tencent.mm.compatible.g.h.dOH, "/sdcard"), this.jlC).show();
          com.tencent.mm.pluginsdk.ui.tools.a.a(this, locala.field_fileFullPath, this.jly, 1);
        }
        aUl();
      }
      return;
      label234: j = (int)(100L * locala.field_offset / locala.field_totalLen);
    }
  }

  public final void ayO()
  {
    Toast.makeText(this, com.tencent.mm.n.bEu, 0).show();
  }

  protected final int getLayoutId()
  {
    return k.bef;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, this.jlB, com.tencent.mm.n.bEs, com.tencent.mm.n.bEt, 1);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    init();
  }

  protected void onDestroy()
  {
    bf.GP().h(this);
    if (this.eBv != null)
      this.eBv.a(this);
    super.onDestroy();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    init();
  }

  protected void onPause()
  {
    bg.qX().b(221, this);
    super.onPause();
    gt localgt = new gt();
    localgt.cLK.tn = false;
    com.tencent.mm.sdk.c.a.aGB().a(localgt, getMainLooper());
    z.d("!44@/B4Tb64lLpKndQxFPEClveSib8MV3PX8lfhyBMAVEhc=", "AppAttachDownloadUI cancel pause auto download logic");
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(221, this);
    gt localgt = new gt();
    localgt.cLK.tn = true;
    com.tencent.mm.sdk.c.a.aGB().a(localgt, getMainLooper());
    z.d("!44@/B4Tb64lLpKndQxFPEClveSib8MV3PX8lfhyBMAVEhc=", "AppAttachDownloadUI req pause auto download logic");
    this.eSA.setEnabled(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachDownloadUI
 * JD-Core Version:    0.6.2
 */