package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.a.c;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.ShowImageUI;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;

public class ImageDownloadUI extends MMActivity
  implements com.tencent.mm.o.m, com.tencent.mm.o.n
{
  private long cDM = 0L;
  private long dxj = 0L;
  private int dyi;
  private TextView ewe;
  private ProgressBar fJc;
  private TextView fJd;
  private TextView fJe;
  private TextView fJf;
  private l fJh;
  private com.tencent.mm.y.ac fJj;
  private ImageView juR;
  private String username;

  private void iY(int paramInt)
  {
    this.fJc.setProgress(paramInt);
    TextView localTextView = this.fJd;
    int i = com.tencent.mm.n.bKz;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    localTextView.setText(getString(i, arrayOfObject));
    if (paramInt < this.fJc.getMax())
      return;
    l locall = ap.yg().Q(this.fJj.ya());
    String str1 = locall.xN();
    if (this.dyi == 1)
      str1 = com.tencent.mm.y.m.c(locall);
    String str2 = ap.yg().f(str1, null, null);
    locall.xR();
    if ((str2 == null) || (str2.equals("")) || (!c.ac(str2)))
    {
      z.d("!24@aCqboZt8TBBxdzAJlMmkPg==", "showImg : imgPath is null");
      return;
    }
    Intent localIntent = new Intent(this, ShowImageUI.class);
    localIntent.putExtra("key_message_id", this.cDM);
    localIntent.putExtra("key_image_path", str2);
    localIntent.putExtra("key_compress_type", this.dyi);
    localIntent.putExtra("key_favorite", true);
    finish();
  }

  protected final void DP()
  {
    this.fJd = ((TextView)findViewById(i.axO));
    this.fJe = ((TextView)findViewById(i.aUQ));
    this.ewe = ((TextView)findViewById(i.aUR));
    this.fJf = ((TextView)findViewById(i.aUO));
    this.juR = ((ImageView)findViewById(i.apX));
    this.juR.setImageResource(h.UB);
    this.fJd.setVisibility(0);
    this.fJe.setVisibility(8);
    this.ewe.setVisibility(8);
    this.fJf.setVisibility(8);
    a(new mq(this));
    this.fJc = ((ProgressBar)findViewById(i.aUP));
  }

  public final void a(int paramInt1, int paramInt2, x paramx)
  {
    z.d("!24@aCqboZt8TBBxdzAJlMmkPg==", "offset " + paramInt1 + "totaolLen  " + paramInt2);
    if (paramx.getType() == 109)
      if (paramInt2 == 0)
        break label64;
    label64: for (int i = -1 + paramInt1 * 100 / paramInt2; ; i = 0)
    {
      iY(Math.max(0, i));
      return;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != 109)
      return;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      iY(this.fJc.getMax());
      return;
    }
    z.e("!24@aCqboZt8TBBxdzAJlMmkPg==", "onSceneEnd : fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    Toast.makeText(this, com.tencent.mm.n.bOS, 1).show();
  }

  protected final int getLayoutId()
  {
    return k.boV;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.cDM = getIntent().getLongExtra("img_msg_id", 0L);
    this.dxj = getIntent().getLongExtra("img_server_id", 0L);
    this.dyi = getIntent().getIntExtra("img_download_compress_type", 0);
    this.username = getIntent().getStringExtra("img_download_username");
    DP();
    if (this.cDM > 0L)
      this.fJh = ap.yg().T(this.cDM);
    if (((this.fJh == null) || (this.fJh.xM() <= 0L)) && (this.dxj > 0L))
      this.fJh = ap.yg().S(this.dxj);
    if ((this.fJh == null) || (this.fJh.xM() <= 0L))
    {
      z.e("!24@aCqboZt8TBBxdzAJlMmkPg==", "onCreate : on such imginfo, with msgLocalId = " + this.cDM + ", or msgSvrId = " + this.dxj);
      return;
    }
    if ((this.cDM <= 0L) && (this.dxj > 0L))
      this.cDM = bg.qW().oV().q(this.username, this.dxj).kk();
    this.fJj = new com.tencent.mm.y.ac(this.fJh.xM(), this.cDM, this.dyi, this);
    bg.qX().d(this.fJj);
  }

  protected void onPause()
  {
    super.onPause();
    bg.qX().b(109, this);
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(109, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ImageDownloadUI
 * JD-Core Version:    0.6.2
 */