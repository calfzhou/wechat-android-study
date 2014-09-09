package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cs;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cl;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.dy;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SelfQRCodeUI extends MMActivity
  implements com.tencent.mm.o.m
{
  private String cDi = "";
  private ProgressDialog dWT = null;
  private Bitmap dnb = null;
  private ImageView eyY = null;
  private TextView jLJ = null;
  private TextView jLK = null;
  private ImageView jLf = null;

  private void aw(String paramString, int paramInt)
  {
    com.tencent.mm.af.a locala = new com.tencent.mm.af.a(paramString, paramInt);
    bg.qX().d(locala);
    ActionBarActivity localActionBarActivity = aPI();
    getString(com.tencent.mm.n.buo);
    this.dWT = com.tencent.mm.ui.base.e.a(localActionBarActivity, getString(com.tencent.mm.n.cdL), true, new o(this, locala, paramString));
  }

  protected final void DP()
  {
    this.cDi = getIntent().getStringExtra("from_userName");
    if (ap.jb(this.cDi))
      this.cDi = com.tencent.mm.model.x.pG();
    if (com.tencent.mm.model.y.dc(this.cDi))
    {
      oP(com.tencent.mm.n.cgN);
      ((TextView)findViewById(com.tencent.mm.i.aJC)).setText(com.tencent.mm.n.caS);
      eB(false);
      this.jLf = ((ImageView)findViewById(com.tencent.mm.i.aOi));
      this.eyY = ((ImageView)findViewById(com.tencent.mm.i.axs));
      this.jLJ = ((TextView)findViewById(com.tencent.mm.i.aGk));
      this.jLK = ((TextView)findViewById(com.tencent.mm.i.apS));
      if (!com.tencent.mm.model.y.dc(this.cDi))
        break label376;
      if (this.dnb != null)
        break label350;
      z.d("!44@/B4Tb64lLpKORaI7+vlNDDvpNc7edh27uicyrYE73Vc=", "%s", new Object[] { "bitmap == null" });
      aw(this.cDi, 0);
      label166: com.tencent.mm.pluginsdk.ui.c.a(this.eyY, this.cDi);
      com.tencent.mm.storage.i locali = bg.qW().oT().ys(this.cDi);
      this.jLJ.setSingleLine(false);
      this.jLJ.setMaxLines(3);
      this.jLJ.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      if (locali == null)
        break label364;
      String str9 = locali.iV();
      if (ap.jb(str9))
        str9 = bg.qW().oZ().xT(this.cDi).field_displayname;
      TextView localTextView2 = this.jLJ;
      localTextView2.setText(com.tencent.mm.ar.b.c(this, str9, (int)this.jLJ.getTextSize()));
      label287: this.jLK.setVisibility(8);
    }
    while (true)
    {
      this.jLf.setOnClickListener(new l(this));
      a(0, h.WS, new m(this));
      a(new n(this));
      return;
      oP(com.tencent.mm.n.cgG);
      break;
      label350: this.jLf.setImageBitmap(this.dnb);
      break label166;
      label364: this.jLJ.setVisibility(8);
      break label287;
      label376: String str1 = (String)bg.qW().oQ().get(42);
      String str2 = getString(com.tencent.mm.n.btu);
      Object localObject;
      if (!ap.jb(str1))
      {
        localObject = str2 + str1;
        label426: z.d("!44@/B4Tb64lLpKORaI7+vlNDDvpNc7edh27uicyrYE73Vc=", "display user name = %s", new Object[] { localObject });
        this.dnb = com.tencent.mm.af.b.yT();
        if (this.dnb != null)
          break label745;
        z.d("!44@/B4Tb64lLpKORaI7+vlNDDvpNc7edh27uicyrYE73Vc=", "%s", new Object[] { "bitmap == null" });
        Di(this.cDi);
      }
      while (true)
      {
        com.tencent.mm.pluginsdk.ui.c.a(this.eyY, com.tencent.mm.model.x.pG());
        String str5 = (String)bg.qW().oQ().get(4);
        z.d("!44@/B4Tb64lLpKORaI7+vlNDDvpNc7edh27uicyrYE73Vc=", "nick name = %s", new Object[] { str5 });
        TextView localTextView1 = this.jLJ;
        localTextView1.setText(com.tencent.mm.ar.b.c(this, str5, (int)this.jLJ.getTextSize()));
        cs localcs = cs.rQ();
        String str6 = ap.ja(localcs.jp());
        String str7 = ap.ja(localcs.jq());
        String str8 = com.tencent.mm.model.y.dX(str6) + " " + str7;
        z.d("!44@/B4Tb64lLpKORaI7+vlNDDvpNc7edh27uicyrYE73Vc=", "display location = %s", new Object[] { str8 });
        this.jLK.setText(str8);
        switch (ap.a((Integer)bg.qW().oQ().get(12290), 0))
        {
        default:
          break;
        case 1:
          this.jLJ.setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.aq.a.n(this, h.VQ), null);
          break;
          String str3 = (String)bg.qW().oQ().get(2);
          String str4 = str2 + str3;
          com.tencent.mm.storage.i.yd(str3);
          localObject = str4;
          break label426;
          label745: this.jLf.setImageBitmap(this.dnb);
        case 2:
        }
      }
      this.jLJ.setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.aq.a.n(this, h.VP), null);
    }
  }

  final void Di(String paramString)
  {
    aw(paramString, ap.a((Integer)bg.qW().oQ().get(66561)));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!44@/B4Tb64lLpKORaI7+vlNDDvpNc7edh27uicyrYE73Vc=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if ((paramx.getType() != 168) || (dy.a(aPI(), paramInt1, paramInt2, paramString, 7)))
      return;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      int i = com.tencent.mm.n.bLd;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      Toast.makeText(this, getString(i, arrayOfObject), 0).show();
      return;
    }
    byte[] arrayOfByte;
    Bitmap localBitmap;
    if (com.tencent.mm.model.y.dc(this.cDi))
    {
      eB(true);
      arrayOfByte = com.tencent.mm.af.b.hj(this.cDi);
      localBitmap = null;
      if (arrayOfByte != null);
    }
    for (this.dnb = localBitmap; ; this.dnb = com.tencent.mm.af.b.yT())
    {
      this.jLf.setImageBitmap(this.dnb);
      return;
      localBitmap = com.tencent.mm.sdk.platformtools.i.cB(arrayOfByte);
      break;
    }
  }

  final void aZb()
  {
    byte[] arrayOfByte;
    if (com.tencent.mm.model.y.dc(this.cDi))
    {
      Bitmap localBitmap = com.tencent.mm.sdk.platformtools.i.aj(findViewById(com.tencent.mm.i.aJB));
      arrayOfByte = null;
      if (localBitmap != null)
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localBitmap.compress(Bitmap.CompressFormat.PNG, 90, localByteArrayOutputStream);
        arrayOfByte = localByteArrayOutputStream.toByteArray();
      }
      if (arrayOfByte == null)
        arrayOfByte = com.tencent.mm.af.b.hj(this.cDi);
    }
    while (true)
    {
      String str2;
      if ((arrayOfByte != null) && (arrayOfByte.length > 0))
        str2 = bc.aFg() + "mmqrcode" + System.currentTimeMillis() + ".png";
      try
      {
        FileOutputStream localFileOutputStream = new FileOutputStream(str2);
        localFileOutputStream.write(arrayOfByte);
        localFileOutputStream.close();
        int i = com.tencent.mm.n.bDP;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = bc.aFg();
        Toast.makeText(this, getString(i, arrayOfObject), 1).show();
        bc.e(str2, this);
        return;
        String str1 = com.tencent.mm.model.x.pG();
        ap.a((Integer)bg.qW().oQ().get(66561));
        arrayOfByte = com.tencent.mm.af.b.hj(str1);
      }
      catch (Exception localException)
      {
      }
    }
  }

  final void aZc()
  {
    bg.qW().oY().zX("@t.qq.com");
    if (ap.a((Integer)bg.qW().oQ().get(9)) != 0);
    for (int i = 1; ; i = 0)
    {
      ArrayList localArrayList = new ArrayList();
      if (i != 0)
        localArrayList.add(getString(com.tencent.mm.n.aal));
      if (!"zh_CN".equals(com.tencent.mm.sdk.platformtools.y.d(getSharedPreferences(ak.aHi(), 0))))
        localArrayList.add(getString(com.tencent.mm.n.cdW));
      String[] arrayOfString = (String[])localArrayList.toArray(new String[localArrayList.size()]);
      com.tencent.mm.ui.base.e.b(this, "", arrayOfString, "", new r(this, arrayOfString));
      return;
    }
  }

  protected final int getLayoutId()
  {
    return k.bmK;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qX().a(158, this);
    bg.qX().a(168, this);
    DP();
  }

  public void onDestroy()
  {
    bg.qX().b(168, this);
    bg.qX().b(158, this);
    if ((this.dnb != null) && (!this.dnb.isRecycled()))
      this.dnb.recycle();
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SelfQRCodeUI
 * JD-Core Version:    0.6.2
 */