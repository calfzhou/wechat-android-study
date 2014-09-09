package com.tencent.mm.ui.qrcode;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.af.a;
import com.tencent.mm.af.b;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.dy;

public class ShowQRCodeStep1UI extends MMActivity
  implements m
{
  private ProgressDialog dWT = null;
  private int jLb = 1;
  private ImageView jLf = null;

  protected final void DP()
  {
    oP(com.tencent.mm.n.cel);
    this.jLf = ((ImageView)findViewById(i.aOi));
    this.jLb = getIntent().getIntExtra("show_to", 1);
    TextView localTextView = (TextView)findViewById(i.aQk);
    Bitmap localBitmap;
    if (this.jLb == 3)
    {
      int m = com.tencent.mm.n.cdO;
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = getString(com.tencent.mm.n.cdS);
      localTextView.setText(getString(m, arrayOfObject4));
      localBitmap = b.yT();
      if (localBitmap != null)
        break label274;
      aYT();
    }
    while (true)
    {
      a(new n(this));
      a(0, h.WS, new o(this));
      ((Button)findViewById(i.aOj)).setOnClickListener(new p(this));
      return;
      if (this.jLb == 4)
      {
        int k = com.tencent.mm.n.cdO;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = getString(com.tencent.mm.n.cdP);
        localTextView.setText(getString(k, arrayOfObject3));
        break;
      }
      if (this.jLb == 2)
      {
        int j = com.tencent.mm.n.cdO;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = getString(com.tencent.mm.n.cdR);
        localTextView.setText(getString(j, arrayOfObject2));
        break;
      }
      int i = com.tencent.mm.n.cdO;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = getString(com.tencent.mm.n.cdQ);
      localTextView.setText(getString(i, arrayOfObject1));
      break;
      label274: this.jLf.setImageBitmap(localBitmap);
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    arrayOfObject1[2] = paramString;
    z.i("!44@/B4Tb64lLpLyuqVLBcN9+Uus+Oh738YWjrXtrK9BSZ8=", "onSceneEnd: errType = %d errCode = %d errMsg = %s", arrayOfObject1);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (dy.a(aPI(), paramInt1, paramInt2, paramString, 7))
      return;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      int i = com.tencent.mm.n.bLd;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(paramInt1);
      arrayOfObject2[1] = Integer.valueOf(paramInt2);
      Toast.makeText(this, getString(i, arrayOfObject2), 0).show();
      return;
    }
    this.jLf.setImageBitmap(b.yT());
  }

  final void aYT()
  {
    a locala = new a();
    bg.qX().d(locala);
    ActionBarActivity localActionBarActivity = aPI();
    getString(com.tencent.mm.n.buo);
    this.dWT = e.a(localActionBarActivity, getString(com.tencent.mm.n.cdL), true, new r(this, locala));
  }

  protected final int getLayoutId()
  {
    return k.bnt;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
    bg.qX().a(168, this);
  }

  public void onDestroy()
  {
    bg.qX().b(168, this);
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.ShowQRCodeStep1UI
 * JD-Core Version:    0.6.2
 */