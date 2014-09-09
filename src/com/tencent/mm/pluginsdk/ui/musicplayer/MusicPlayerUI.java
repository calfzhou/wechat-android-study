package com.tencent.mm.pluginsdk.ui.musicplayer;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.model.an;
import com.tencent.mm.model.ao;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.a.tb;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import java.io.IOException;

public abstract class MusicPlayerUI extends MMActivity
{
  private ao gDK = new n(this);
  protected p hGA = p.hGM;
  private boolean hGB = false;
  protected LyricView hGC;
  private View hGD;
  private CdnImageView hGE;
  private TextView hGF;
  private TextView hGG;
  private TextView hGH;
  private TextView hGI;
  private f hGJ;
  private final int hGK = 65537;
  private tb hGu = null;
  private cm mHandler = new i(this);
  private long time = 0L;

  private void aCX()
  {
    this.hGF = ((TextView)findViewById(com.tencent.mm.i.aRD));
    this.hGG = ((TextView)findViewById(com.tencent.mm.i.aRF));
    this.hGH = ((TextView)findViewById(com.tencent.mm.i.aRC));
    this.hGE = ((CdnImageView)findViewById(com.tencent.mm.i.aRB));
    this.hGI = ((TextView)findViewById(com.tencent.mm.i.aZY));
    if (aDd() == null)
    {
      this.hGF.setText("");
      this.hGG.setText("");
      this.hGH.setText("");
    }
    while (true)
    {
      if (this.hGJ != null)
        this.hGJ.a(this.hGu, ajW(), getAppId(), ajZ());
      a(this.hGE, this.hGu);
      return;
      this.hGF.setText(aDd().inb);
      this.hGG.setText(aDd().inc);
      this.hGH.setText(aDd().ind);
    }
  }

  private void dL(boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        if (this.hGC != null)
        {
          tb localtb = this.hGu;
          if (localtb != null);
        }
        else
        {
          return;
        }
        this.hGC.a(null);
        this.hGC.setKeepScreenOn(false);
        this.hGC.stop();
        z.i("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "reset lyric View");
        if ((ch.jb(this.hGu.inj)) && (paramBoolean))
        {
          z.i("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "start synlyric");
          aDc();
          continue;
        }
      }
      finally
      {
      }
      if (!ch.jb(this.hGu.inj))
      {
        a locala = a.bh(this.hGu.inj, getString(com.tencent.mm.n.bTt));
        this.hGC.a(locala);
        this.hGC.setKeepScreenOn(true);
      }
    }
  }

  protected abstract void a(CdnImageView paramCdnImageView, tb paramtb);

  protected final void aCY()
  {
    if (aDd() == null)
    {
      z.w("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "doBeingPlayMusic: but item is null");
      return;
    }
    new cm(getMainLooper()).post(new l(this));
  }

  protected final void aCZ()
  {
    if (aDd() == null)
      return;
    if (this.hGC != null)
    {
      ((ImageView)this.hGD).setImageResource(h.abs);
      this.hGA = p.hGO;
      this.hGC.a(a.bh(aDd().inj, getString(com.tencent.mm.n.bTt)));
      this.hGC.aCS();
      this.hGC.aCU();
      this.hGC.setKeepScreenOn(true);
      return;
    }
    ((TextView)this.hGD).setText(com.tencent.mm.n.bTr);
  }

  protected final void aDa()
  {
    ((ImageView)this.hGD).setImageResource(h.YM);
    this.hGA = p.hGM;
    this.hGC.setKeepScreenOn(false);
    this.hGC.stop();
  }

  protected boolean aDb()
  {
    return !ajU();
  }

  protected void aDc()
  {
  }

  protected final tb aDd()
  {
    try
    {
      if (this.hGu == null)
        aN(getIntent().getByteArrayExtra("music_player_ui"));
      if (this.hGu == null)
        this.hGu = bg.ii().la();
      if (this.hGu == null)
      {
        this.hGu = null;
        bg.ii().release();
        z.e("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "has no play resource but enter music UI ");
      }
      tb localtb = this.hGu;
      return localtb;
    }
    finally
    {
    }
  }

  protected void aN(byte[] paramArrayOfByte)
  {
    if (ch.B(paramArrayOfByte))
    {
      z.w("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "updateShakeMusicItem errro");
      return;
    }
    try
    {
      this.hGu = new tb().cd(paramArrayOfByte);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.hGu.toString();
      z.i("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "updateMusicItem ok: [%s]", arrayOfObject);
      return;
    }
    catch (IOException localIOException)
    {
      z.w("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "parser error, ");
      this.hGu = null;
    }
  }

  protected final void aae()
  {
    new cm(getMainLooper()).post(new o(this));
  }

  protected abstract String ajO();

  protected boolean ajR()
  {
    return true;
  }

  protected boolean ajS()
  {
    return true;
  }

  protected abstract int ajT();

  protected abstract boolean ajU();

  protected abstract boolean ajV();

  protected abstract String ajW();

  protected abstract d ajX();

  protected boolean ajY()
  {
    return true;
  }

  protected abstract String ajZ();

  protected final void c(tb paramtb)
  {
    this.hGu = paramtb;
  }

  protected abstract String getAppId();

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.biz;
  }

  protected final void mW(int paramInt)
  {
    Message localMessage = Message.obtain();
    localMessage.obj = Integer.valueOf(paramInt);
    localMessage.what = 65537;
    this.mHandler.sendMessage(localMessage);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((this.hGJ == null) || (this.hGJ.onActivityResult(paramInt1, paramInt2, paramIntent)))
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
      z.v("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "onConfigChanged:" + paramConfiguration.orientation);
    super.onConfigurationChanged(paramConfiguration);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (aDb())
      bg.ii().release();
    if (aDd() == null)
    {
      finish();
      return;
    }
    this.hGJ = new f(aDd(), this, ajW(), getAppId(), ajZ(), ajX());
    this.hGJ.onCreate();
    if ((q.hGQ == ajT()) && (aDd() != null))
    {
      ((ViewStub)findViewById(com.tencent.mm.i.aZU)).inflate();
      this.hGC = ((LyricView)findViewById(com.tencent.mm.i.aBf));
      this.hGC.release();
      this.hGC.vL(ajZ());
    }
    while (true)
    {
      this.hGD = findViewById(com.tencent.mm.i.aRE);
      this.hGD.setOnClickListener(new j(this));
      if ((this.hGu == null) || ((ch.jb(this.hGu.ini)) && (ch.jb(this.hGu.ing)) && (ch.jb(this.hGu.inh))))
        this.hGD.setVisibility(8);
      oP(com.tencent.mm.n.bTs);
      a(new k(this));
      aCX();
      if (!ajY())
        break;
      z.d("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "auto play on create");
      aCY();
      return;
      ((ViewStub)findViewById(com.tencent.mm.i.aZZ)).inflate();
    }
  }

  protected void onDestroy()
  {
    bg.ii().c(this.gDK);
    if (this.hGC != null)
      this.hGC.release();
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (4 == paramInt)
      z.w("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "on back key down");
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    if (ajR())
    {
      this.hGC.aCU();
      this.hGC.aCS();
      this.hGC.stop();
      this.hGC.setKeepScreenOn(false);
    }
    this.hGB = true;
    super.onPause();
  }

  protected void onResume()
  {
    this.hGB = false;
    if (aDd() == null)
      return;
    boolean bool;
    if (ajS())
    {
      if ((aDd() != null) && (bg.ii().kT()))
      {
        this.hGA = p.hGO;
        ((ImageView)this.hGD).setImageResource(h.abs);
        bg.ii().a(this.gDK);
        if (ajY())
          break label127;
        bool = true;
        dL(bool);
      }
      if (!bg.ii().kT())
        break label132;
      ((ImageView)this.hGD).setImageResource(h.abs);
      this.hGA = p.hGO;
      this.hGC.aCT();
    }
    while (true)
    {
      super.onResume();
      return;
      label127: bool = false;
      break;
      label132: ((ImageView)this.hGD).setImageResource(h.YM);
      this.hGA = p.hGM;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.MusicPlayerUI
 * JD-Core Version:    0.6.2
 */