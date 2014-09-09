package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class j
  implements ae
{
  private int cg;
  protected LayoutInflater gJ;
  protected o hM;
  private int kA;
  protected ag kB;
  protected Context kw;
  protected LayoutInflater kx;
  private af ky;
  private int kz;
  protected Context mContext;

  public j(Context paramContext, int paramInt1, int paramInt2)
  {
    this.kw = paramContext;
    this.kx = LayoutInflater.from(paramContext);
    this.kz = paramInt1;
    this.kA = paramInt2;
  }

  public View a(s params, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof ah));
    for (ah localah = (ah)paramView; ; localah = (ah)this.kx.inflate(this.kA, paramViewGroup, false))
    {
      a(params, localah);
      return (View)localah;
    }
  }

  public void a(Context paramContext, o paramo)
  {
    this.mContext = paramContext;
    this.gJ = LayoutInflater.from(this.mContext);
    this.hM = paramo;
  }

  public final void a(af paramaf)
  {
    this.ky = paramaf;
  }

  public void a(o paramo, boolean paramBoolean)
  {
    if (this.ky != null)
      this.ky.a(paramo, paramBoolean);
  }

  public abstract void a(s params, ah paramah);

  public boolean a(ak paramak)
  {
    if (this.ky != null)
      return this.ky.b(paramak);
    return false;
  }

  public ag b(ViewGroup paramViewGroup)
  {
    if (this.kB == null)
    {
      this.kB = ((ag)this.kx.inflate(this.kz, paramViewGroup, false));
      this.kB.d(this.hM);
      j(true);
    }
    return this.kB;
  }

  public boolean b(s params)
  {
    return true;
  }

  protected boolean b(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }

  public boolean bB()
  {
    return false;
  }

  public final boolean d(s params)
  {
    return false;
  }

  public final boolean e(s params)
  {
    return false;
  }

  public void j(boolean paramBoolean)
  {
    ViewGroup localViewGroup1 = (ViewGroup)this.kB;
    if (localViewGroup1 == null);
    label212: label221: 
    while (true)
    {
      return;
      int i;
      int m;
      if (this.hM != null)
      {
        this.hM.bQ();
        ArrayList localArrayList = this.hM.bP();
        int j = localArrayList.size();
        int k = 0;
        i = 0;
        if (k < j)
        {
          s locals1 = (s)localArrayList.get(k);
          if (!b(locals1))
            break label212;
          View localView1 = localViewGroup1.getChildAt(i);
          if ((localView1 instanceof ah));
          for (s locals2 = ((ah)localView1).bp(); ; locals2 = null)
          {
            View localView2 = a(locals1, localView1, localViewGroup1);
            if (locals1 != locals2)
              localView2.setPressed(false);
            if (localView2 != localView1)
            {
              ViewGroup localViewGroup2 = (ViewGroup)localView2.getParent();
              if (localViewGroup2 != null)
                localViewGroup2.removeView(localView2);
              ((ViewGroup)this.kB).addView(localView2, i);
            }
            m = i + 1;
            k++;
            i = m;
            break;
          }
        }
      }
      while (true)
      {
        if (i >= localViewGroup1.getChildCount())
          break label221;
        if (!b(localViewGroup1, i))
        {
          i++;
          continue;
          m = i;
          break;
          i = 0;
        }
      }
    }
  }

  public final void setId(int paramInt)
  {
    this.cg = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.j
 * JD-Core Version:    0.6.2
 */