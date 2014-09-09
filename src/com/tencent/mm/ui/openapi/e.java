package com.tencent.mm.ui.openapi;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.o;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.List;

public final class e extends BaseAdapter
  implements al
{
  private Context context;
  private List hKR;
  private boolean jJR = false;
  private int jJS = 0;

  public e(Context paramContext, int paramInt)
  {
    this.context = paramContext;
    this.jJS = paramInt;
    init();
  }

  private int aPA()
  {
    return this.hKR.size();
  }

  private int apd()
  {
    return (4 - aPA() % 4) % 4;
  }

  private void init()
  {
    int i = 0;
    this.hKR = new ArrayList();
    o localo = bf.GO();
    int j = this.jJS;
    Cursor localCursor = localo.rawQuery("select * from AppInfo where status = " + j + " and (appType is null or appType not like ',1,')", new String[0]);
    if (localCursor == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "getAppByStatusExcludeByType: curosr is null");
      localCursor = null;
    }
    if (localCursor != null)
    {
      int k = localCursor.getCount();
      while (i < k)
      {
        localCursor.moveToPosition(i);
        com.tencent.mm.pluginsdk.model.app.k localk = new com.tencent.mm.pluginsdk.model.app.k();
        localk.b(localCursor);
        if (l.d(this.context, localk.field_appId))
          this.hKR.add(localk);
        i++;
      }
      localCursor.close();
    }
  }

  public final void a(String paramString, ao paramao)
  {
    init();
    super.notifyDataSetChanged();
  }

  public final boolean aYJ()
  {
    return this.jJR;
  }

  public final void fQ(boolean paramBoolean)
  {
    this.jJR = paramBoolean;
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    return aPA() + apd();
  }

  public final Object getItem(int paramInt)
  {
    if (oL(paramInt))
      return null;
    return this.hKR.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    s locals;
    if (paramView == null)
    {
      locals = new s();
      paramView = View.inflate(this.context, com.tencent.mm.k.baT, null);
      locals.fzX = ((ImageView)paramView.findViewById(i.agn));
      locals.hzG = ((TextView)paramView.findViewById(i.agm));
      locals.dYV = ((TextView)paramView.findViewById(i.ago));
      locals.jKm = paramView.findViewById(i.agp);
      paramView.setTag(locals);
    }
    while (true)
    {
      locals.jKm.setVisibility(4);
      if (!oL(paramInt))
        break;
      locals.fzX.setVisibility(4);
      locals.hzG.setVisibility(4);
      locals.dYV.setVisibility(4);
      return paramView;
      locals = (s)paramView.getTag();
    }
    com.tencent.mm.pluginsdk.model.app.k localk = (com.tencent.mm.pluginsdk.model.app.k)getItem(paramInt);
    locals.fzX.setVisibility(0);
    Bitmap localBitmap = l.b(localk.field_appId, 1, a.getDensity(this.context));
    if (localBitmap == null)
      locals.fzX.setBackgroundResource(h.RS);
    while (true)
    {
      locals.dYV.setVisibility(0);
      locals.dYV.setText(l.d(this.context, localk));
      if (!this.jJR)
        break;
      locals.hzG.setVisibility(0);
      return paramView;
      locals.fzX.setBackgroundDrawable(new BitmapDrawable(localBitmap));
    }
    locals.hzG.setVisibility(8);
    return paramView;
  }

  public final boolean oL(int paramInt)
  {
    int i = this.hKR.size();
    return (paramInt >= i) && (paramInt < i + apd());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.e
 * JD-Core Version:    0.6.2
 */