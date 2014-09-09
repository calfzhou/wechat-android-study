package com.tencent.mm.pluginsdk.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import com.tencent.mm.aq.a;
import com.tencent.mm.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Map;

public class SmileyGrid extends GridView
{
  public static final int hzi;
  public static int hzk;
  private int eDG = 0;
  private AdapterView.OnItemClickListener goF = new au(this);
  public ax hzj;
  private int hzl = 20;
  private int hzm;
  private int hzn;
  public int hzo = 0;
  private int hzp = 0;
  public int hzq;
  private String hzr;
  private bb hzs;
  private h hzt;
  public boolean hzu;
  private boolean hzv;
  private boolean hzw;
  private Map hzx = new HashMap();
  private Context mContext;

  static
  {
    Context localContext = ak.getContext();
    if (localContext == null);
    for (int i = 86; ; i = a.q(localContext, a.o(localContext, g.Qk)))
    {
      hzi = i;
      hzk = 1;
      return;
    }
  }

  public SmileyGrid(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    if (Ob())
      init(paramContext);
  }

  public SmileyGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    if (Ob())
      init(this.mContext);
  }

  private void init(Context paramContext)
  {
    this.hzj = new ax(this);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    setBackgroundResource(0);
    setStretchMode(2);
    switch (this.hzl)
    {
    case 21:
    case 22:
    case 24:
    default:
    case 20:
    case 23:
    case 25:
    }
    while (true)
    {
      setColumnWidth(this.hzm);
      setAdapter(this.hzj);
      setOnItemClickListener(this.goF);
      int i = a.fromDPToPix(paramContext, 6);
      int j = a.fromDPToPix(paramContext, 6);
      int k = a.fromDPToPix(paramContext, 6);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.hzm);
      z.i("!32@/B4Tb64lLpJimsn0tIjWLdbyd6XDG6bV", "mItemWidthInPix:%d", arrayOfObject1);
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = Integer.valueOf(j);
      arrayOfObject2[2] = Integer.valueOf(k);
      z.i("!32@/B4Tb64lLpJimsn0tIjWLdbyd6XDG6bV", "paddingLeft:%d,paddingRight:%d,paddingTop:%d", arrayOfObject2);
      setPadding(i, k, j, 0);
      return;
      this.hzm = a.fromDPToPix(this.mContext, 43);
      continue;
      this.hzm = a.fromDPToPix(this.mContext, 80);
    }
  }

  protected boolean Ob()
  {
    return true;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString)
  {
    z.v("!32@/B4Tb64lLpJimsn0tIjWLdbyd6XDG6bV", "type:" + paramInt1 + " itemsPerPage:" + paramInt4 + " totalPage:" + paramInt5 + " curPage:" + this.hzq);
    z.v("!32@/B4Tb64lLpJimsn0tIjWLdbyd6XDG6bV", "type:" + paramInt1 + " itemsPerPage:" + paramInt4 + " totalPage:" + paramInt5 + " curPage:" + this.hzq);
    this.hzu = false;
    this.hzl = paramInt1;
    this.hzq = paramInt2;
    this.hzn = paramInt3;
    this.hzo = paramInt4;
    this.hzp = paramInt5;
    this.hzr = paramString;
    this.eDG = paramInt6;
    setNumColumns(paramInt6);
    if (this.hzj != null)
    {
      this.hzj.update();
      this.hzj.aAp();
    }
  }

  public final void a(bb parambb)
  {
    this.hzs = parambb;
  }

  public final void a(h paramh)
  {
    this.hzt = paramh;
  }

  @TargetApi(8)
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void release()
  {
    this.hzt = null;
    this.hzs = null;
    if (this.hzj != null)
      this.hzj.aAq();
  }

  public final void s(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.hzv = paramBoolean1;
    this.hzw = paramBoolean2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.SmileyGrid
 * JD-Core Version:    0.6.2
 */