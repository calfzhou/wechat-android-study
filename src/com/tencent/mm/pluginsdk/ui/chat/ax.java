package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cn;
import java.util.ArrayList;

public final class ax
{
  private Bitmap bitmap = null;
  private ImageView cKf = null;
  private Context context;
  private SharedPreferences dkI;
  private View epk = null;
  private View flr;
  private aw hEi;
  private av hEj;
  private cn hEk;
  private boolean hEl = true;
  private bc hEm;
  private View hza;

  public ax(Context paramContext, View paramView1, View paramView2, bc parambc)
  {
    this.context = paramContext;
    this.hza = paramView1;
    this.flr = paramView2;
    this.hEi = new aw(this.context);
    this.dkI = paramContext.getSharedPreferences(ak.aHi(), 0);
    this.hEm = parambc;
    this.epk = View.inflate(this.context, k.bcj, null);
    this.cKf = ((ImageView)this.epk.findViewById(i.aLj));
    this.hEk = new cn(this.epk, -2, -2, (byte)0);
    this.hEk.setBackgroundDrawable(new ColorDrawable(0));
    this.hEk.setOutsideTouchable(true);
    this.epk.setOnClickListener(new ay(this));
  }

  private float mT(int paramInt)
  {
    return TypedValue.applyDimension(1, paramInt, this.context.getResources().getDisplayMetrics());
  }

  public final void aCH()
  {
    az localaz = new az(this, this.context.getMainLooper());
    bg.qQ().n(new ba(this, localaz));
  }

  public final void aCI()
  {
    this.hEl = false;
  }

  public final String aCJ()
  {
    while (true)
    {
      try
      {
        av localav1;
        if (this.hEi == null)
        {
          z.d("!44@/B4Tb64lLpKYgkPW7g2h7ZPkZDASCTQgMn5vbr5V3XA=", "because of imageQuery == null");
          localav1 = null;
          this.hEj = localav1;
          av localav2 = this.hEj;
          if (localav2 == null)
          {
            str = null;
            return str;
          }
        }
        else
        {
          ArrayList localArrayList = this.hEi.aCG();
          if ((localArrayList == null) || (localArrayList.size() == 0))
          {
            z.d("!44@/B4Tb64lLpKYgkPW7g2h7ZPkZDASCTQgMn5vbr5V3XA=", "because of items == null || items.size() == 0");
            localav1 = null;
            continue;
          }
          localav1 = (av)localArrayList.get(0);
          if (localav1 != null)
          {
            if (ch.ab(localav1.eVN) >= 0L)
              break label299;
            i = 1;
            if (i != 0)
            {
              Object[] arrayOfObject1 = new Object[1];
              arrayOfObject1[0] = localav1.hEh;
              z.e("!44@/B4Tb64lLpKYgkPW7g2h7ZPkZDASCTQgMn5vbr5V3XA=", "we found u have a future pic that lead to forbid this featur. file : %s", arrayOfObject1);
              localav1 = null;
              continue;
            }
          }
          if ((localav1 != null) && (localav1.hEh != null) && (localav1.hEh.startsWith(h.dOL)))
          {
            localav1 = null;
            continue;
          }
          if (localav1 != null)
          {
            if (ch.ab(localav1.eVN) > 30L)
              break label305;
            j = 1;
            if (j != 0)
            {
              if (!this.dkI.getString("chattingui_recent_shown_image_path", "").equals(localav1.hEh))
                continue;
              z.d("!44@/B4Tb64lLpKYgkPW7g2h7ZPkZDASCTQgMn5vbr5V3XA=", "because of recentImage.equals(imageItem.orginalPath)");
              localav1 = null;
              continue;
            }
          }
          Object[] arrayOfObject2 = new Object[1];
          if (localav1 != null)
            break label311;
          bool = true;
          arrayOfObject2[0] = Boolean.valueOf(bool);
          z.d("!44@/B4Tb64lLpKYgkPW7g2h7ZPkZDASCTQgMn5vbr5V3XA=", "because of checkAddDate(addDate) == false, or imageItem == null : %s", arrayOfObject2);
          localav1 = null;
          continue;
        }
        String str = this.hEj.cEF;
        if (this.hEj.cEF != null)
          continue;
        str = this.hEj.hEh;
        continue;
      }
      finally
      {
      }
      label299: int i = 0;
      continue;
      label305: int j = 0;
      continue;
      label311: boolean bool = false;
    }
  }

  public final void hide()
  {
    if (this.hEk == null)
      return;
    this.hEk.dismiss();
  }

  public final void show()
  {
    if ((this.cKf == null) || (this.hEj == null) || (this.bitmap == null) || (this.hEk == null) || (this.hza == null) || (this.flr == null))
      return;
    this.cKf.setImageBitmap(this.bitmap);
    int i;
    if (this.hEl)
    {
      i = 83;
      if (!this.hEl)
        break label122;
    }
    label122: for (int j = 0; ; j = 10)
    {
      this.hEk.showAtLocation(this.hza, i, j, this.flr.getHeight());
      new com.tencent.mm.sdk.platformtools.ay(new bb(this), false).cP(10000L);
      return;
      i = 85;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ax
 * JD-Core Version:    0.6.2
 */