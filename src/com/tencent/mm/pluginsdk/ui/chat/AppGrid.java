package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import java.util.List;

public class AppGrid extends GridView
{
  private Context context;
  private SharedPreferences dkI;
  private AdapterView.OnItemLongClickListener eQu = new b(this);
  private AdapterView.OnItemClickListener goF = new a(this);
  private e hCf;
  private int hCg;
  private int hCh = 0;
  private int hCi = 0;
  private int hCj;
  private int hCk;
  private c hCl;

  public AppGrid(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
  }

  public AppGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }

  public AppGrid(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.hCj = paramInt1;
    this.hCg = paramInt2;
    this.hCh = paramInt3;
    this.hCi = paramInt4;
    this.hCk = paramInt6;
    setNumColumns(paramInt5);
  }

  public final void a(e parame)
  {
    this.hCf = parame;
  }

  public final void aW(List paramList)
  {
    this.hCl = new c(this, this.context, paramList);
    setBackgroundResource(0);
    setAdapter(this.hCl);
    setOnItemClickListener(this.goF);
    setOnItemLongClickListener(this.eQu);
    int i = com.tencent.mm.sdk.platformtools.e.a(this.context, 10.0F);
    int j = com.tencent.mm.sdk.platformtools.e.a(this.context, 10.0F);
    setPadding(i, com.tencent.mm.sdk.platformtools.e.a(this.context, 6.0F), j, 0);
  }

  public int getCount()
  {
    return this.hCl.getCount();
  }

  public final void mI(int paramInt)
  {
    if (paramInt <= 0)
      return;
    setPadding(com.tencent.mm.sdk.platformtools.e.a(this.context, 10.0F), paramInt, com.tencent.mm.sdk.platformtools.e.a(this.context, 10.0F), 0);
    setVerticalSpacing(paramInt / 2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.AppGrid
 * JD-Core Version:    0.6.2
 */