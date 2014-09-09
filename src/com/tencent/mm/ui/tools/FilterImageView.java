package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MMHorList;

public class FilterImageView extends LinearLayout
{
  static br[] jQx = arrayOfbr;
  private Activity cKR;
  private int guW = 0;
  private int[] jQo;
  private View jQp;
  private ImageView jQq;
  private CropImageView jQr;
  private Bitmap jQs;
  private MMHorList jQt;
  private bo jQu;
  private Runnable jQv;
  private Runnable jQw;

  static
  {
    br[] arrayOfbr = new br[12];
    arrayOfbr[0] = new br(new bq("原图", "原圖", "Normal"), "icon.png", 0, 0, "MatteOrigin.jpg", 0);
    arrayOfbr[1] = new br(new bq("LOMO", "LOMO", "LOMO"), "nuowei_mask%02d.jpg", 2, 1, "0004.jpg", 2);
    arrayOfbr[2] = new br(new bq("麦田", "麥田", "Wheat"), "0062_%02d.jpg", 2, 2, "0062.jpg", 20);
    arrayOfbr[3] = new br(new bq("玻璃镜", "玻璃鏡", "Glossy"), "habi_mask%02d.jpg", 1, 3, "0005.jpg", 4);
    arrayOfbr[4] = new br(new bq("拍立得", "拍立得", "Polaroid"), "0063_%02d.jpg", 2, 4, "0063.jpg", 21);
    arrayOfbr[5] = new br(new bq("湖水", "湖水", "Lake"), "0061_%02d.jpg", 1, 5, "0061.jpg", 19);
    arrayOfbr[6] = new br(new bq("黄昏", "黃昏", "Twilight"), "0030_mask%01d.jpg", 1, 6, "0030.jpg", 7);
    arrayOfbr[7] = new br(new bq("黑白", "黑白", "B&W"), "0065_%02d.jpg", 1, 7, "0065.jpg", 22);
    arrayOfbr[8] = new br(new bq("铜版画", "銅版畫", "Aquatint"), "0032_mask%01d.jpg", 1, 8, "0032.jpg", 9);
    arrayOfbr[9] = new br(new bq("圆珠笔", "圓珠筆", "Pen"), "0035_mask%01d.jpg", 1, 9, "0035.jpg", 18);
    arrayOfbr[10] = new br(new bq("海报", "海報", "Poster"), "0036_mask%01d.jpg", 0, 10, "0036.jpg", 17);
    arrayOfbr[11] = new br(new bq("素描", "素描", "Portrait"), "icon.jpg", 0, 11, "0040.jpg", 12);
  }

  public FilterImageView(Context paramContext)
  {
    super(paramContext);
    this.cKR = ((Activity)paramContext);
    init();
  }

  public FilterImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.cKR = ((Activity)paramContext);
    init();
  }

  private void init()
  {
    View localView = View.inflate(this.cKR, k.bdZ, this);
    this.jQr = ((CropImageView)localView.findViewById(com.tencent.mm.i.ape));
    this.jQq = ((ImageView)localView.findViewById(com.tencent.mm.i.apk));
    this.jQp = localView.findViewById(com.tencent.mm.i.aph);
    this.jQr.setOnTouchListener(null);
    this.jQt = ((MMHorList)localView.findViewById(com.tencent.mm.i.apd));
    this.jQu = new bo(this);
    this.jQt.setAdapter(this.jQu);
    this.jQt.invalidate();
    this.jQt.setOnItemClickListener(new bn(this));
  }

  public final Bitmap aZX()
  {
    return this.jQs;
  }

  public final void aZY()
  {
    if (this.jQr != null)
      this.jQr.gb(false);
  }

  public final void aZZ()
  {
    if (this.jQr != null)
    {
      this.jQr.setScaleType(ImageView.ScaleType.MATRIX);
      this.jQr.aZR();
    }
  }

  public final void ay(String paramString, int paramInt)
  {
    z.i("!32@/B4Tb64lLpLxetNgbG3pY/jjX49X0q4a", "filePath before fiterBmp:" + paramString);
    if ((this.jQs == null) || (this.jQs.isRecycled()))
      this.jQs = com.tencent.mm.sdk.platformtools.i.a(com.tencent.mm.sdk.platformtools.i.a(paramString, 480, 480, false), paramInt);
    z.d("!32@/B4Tb64lLpLxetNgbG3pY/jjX49X0q4a", "filterBmp w:" + this.jQs.getWidth() + " h:" + this.jQs.getHeight());
    this.jQo = new int[this.jQs.getWidth() * this.jQs.getHeight()];
    this.jQs.getPixels(this.jQo, 0, this.jQs.getWidth(), 0, 0, this.jQs.getWidth(), this.jQs.getHeight());
    this.jQr.setImageBitmap(this.jQs);
  }

  public final CropImageView baa()
  {
    return this.jQr;
  }

  public final View bab()
  {
    return this.jQp;
  }

  public final void bac()
  {
    if (this.jQq != null)
      this.jQq.setVisibility(0);
  }

  public final int bad()
  {
    return this.guW;
  }

  public final void onDestroy()
  {
    this.jQo = null;
    if ((this.jQs != null) && (!this.jQs.isRecycled()))
      this.jQs.recycle();
    this.jQs = null;
  }

  public final void r(Bitmap paramBitmap)
  {
    this.jQs = paramBitmap;
  }

  public final void setMatrix(Matrix paramMatrix)
  {
    if (this.jQr != null)
      this.jQr.setImageMatrix(paramMatrix);
  }

  public void setVisibility(int paramInt)
  {
    if (paramInt == 0)
    {
      this.jQu.notifyDataSetChanged();
      this.jQt.invalidate();
    }
    super.setVisibility(paramInt);
  }

  public final void u(Runnable paramRunnable)
  {
    this.jQv = paramRunnable;
  }

  public final void v(Runnable paramRunnable)
  {
    this.jQw = paramRunnable;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.FilterImageView
 * JD-Core Version:    0.6.2
 */