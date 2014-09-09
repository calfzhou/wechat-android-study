package com.tencent.mm.ui.applet;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;

public class SecurityImage extends LinearLayout
{
  private aa fav = null;
  private String iPK = null;
  private String iPL = null;
  private boolean iPN = false;
  private ProgressBar iVP = null;
  private ImageView iVQ = null;
  private Button iVR = null;
  private EditText iVS = null;
  private r iVT;

  public SecurityImage(Context paramContext)
  {
    super(paramContext);
  }

  public SecurityImage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void a(boolean paramBoolean, Bitmap paramBitmap, String paramString1, String paramString2)
  {
    this.iPK = paramString1;
    this.iPL = paramString2;
    this.iPN = paramBoolean;
    if (paramBitmap != null)
    {
      this.iVQ.setImageBitmap(paramBitmap);
      return;
    }
    z.e("!32@/B4Tb64lLpLCHt2tgayO47zr1AOy7hh2", "setSecImg failed, decode failed");
  }

  private void eL(boolean paramBoolean)
  {
    ImageView localImageView1 = this.iVQ;
    int i;
    ImageView localImageView2;
    if (paramBoolean)
    {
      i = 255;
      localImageView1.setAlpha(i);
      localImageView2 = this.iVQ;
      if (!paramBoolean)
        break label68;
    }
    label68: for (int j = 0; ; j = -5592406)
    {
      localImageView2.setBackgroundColor(j);
      ProgressBar localProgressBar = this.iVP;
      int k = 0;
      if (paramBoolean)
        k = 4;
      localProgressBar.setVisibility(k);
      return;
      i = 40;
      break;
    }
  }

  public final void a(r paramr)
  {
    if (this.iVT != null)
      this.iVT.d(null);
    this.iVT = paramr;
    this.iVT.d(this);
  }

  protected final void a(boolean paramBoolean, Bitmap paramBitmap)
  {
    eL(true);
    if (paramBoolean)
    {
      a(false, paramBitmap, null, null);
      this.iVS.clearComposingText();
      this.iVS.setText("");
    }
  }

  public final void a(boolean paramBoolean, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    this.iVP = ((ProgressBar)findViewById(com.tencent.mm.i.aLq));
    this.iVQ = ((ImageView)findViewById(com.tencent.mm.i.agW));
    this.iVR = ((Button)findViewById(com.tencent.mm.i.agU));
    this.iVS = ((EditText)findViewById(com.tencent.mm.i.agV));
    this.iVR.setOnClickListener(new l(this));
    if (this.iVT != null)
      this.iVT.onStart();
    b(paramBoolean, paramArrayOfByte, paramString1, paramString2);
  }

  public final String aRh()
  {
    return this.iPK;
  }

  public final String aRi()
  {
    if (this.iVS == null)
      return "";
    return this.iVS.getText().toString().trim();
  }

  public final String aRj()
  {
    return this.iPL;
  }

  public final void b(boolean paramBoolean, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    int i = -1;
    eL(true);
    this.iPK = paramString1;
    this.iPL = paramString2;
    this.iPN = paramBoolean;
    Object[] arrayOfObject1 = new Object[1];
    int j;
    Bitmap localBitmap;
    Object[] arrayOfObject2;
    if (paramArrayOfByte == null)
    {
      j = i;
      arrayOfObject1[0] = Integer.valueOf(j);
      z.d("!32@/B4Tb64lLpLCHt2tgayO47zr1AOy7hh2", "dkwt setSecImg imgBuf:%d", arrayOfObject1);
      if (paramArrayOfByte != null)
      {
        localBitmap = com.tencent.mm.sdk.platformtools.i.cB(paramArrayOfByte);
        if (localBitmap == null)
          break label148;
        arrayOfObject2 = new Object[3];
        if (paramArrayOfByte != null)
          break label141;
      }
    }
    while (true)
    {
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = Integer.valueOf(localBitmap.getWidth());
      arrayOfObject2[2] = Integer.valueOf(localBitmap.getHeight());
      z.d("!32@/B4Tb64lLpLCHt2tgayO47zr1AOy7hh2", "dkwt setSecImg imgBuf:%d  [%d %d]", arrayOfObject2);
      a(paramBoolean, localBitmap, paramString1, paramString2);
      return;
      j = paramArrayOfByte.length;
      break;
      label141: i = paramArrayOfByte.length;
    }
    label148: z.e("!32@/B4Tb64lLpLCHt2tgayO47zr1AOy7hh2", "[arthurdan.securityImgCrash] Fatal Error!!! setSecImg failed, decode failed");
  }

  public final void dismiss()
  {
    if (this.fav != null)
    {
      this.fav.dismiss();
      this.fav = null;
    }
  }

  public final boolean yY()
  {
    return this.iPN;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.SecurityImage
 * JD-Core Version:    0.6.2
 */