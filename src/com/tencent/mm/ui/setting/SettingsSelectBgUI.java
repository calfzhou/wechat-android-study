package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import com.tencent.mm.ad.j;
import com.tencent.mm.ad.s;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ab;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SettingsSelectBgUI extends MMActivity
  implements com.tencent.mm.o.m
{
  private List huI = new ArrayList();
  private boolean jNg;
  private fd jOc;
  private GridView jOd;
  private j jOe;
  private ay jOf = new ay(new ez(this), true);
  private String username;

  private void bl(List paramList)
  {
    if (paramList.size() > 0)
    {
      this.jOe = ((j)paramList.remove(0));
      bg.qX().d(this.jOe);
      return;
    }
    this.jOe = null;
  }

  protected final void DP()
  {
    oP(n.cfo);
    a(new fa(this));
    this.jNg = getIntent().getBooleanExtra("isApplyToAll", true);
    this.username = getIntent().getStringExtra("username");
    this.jOf.cP(20L);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((!(paramx instanceof ab)) || (((ab)paramx).tu() != 1))
      z.d("!44@/B4Tb64lLpJkrm2DE1IrT03v4L09z6OmhNfUL88lD+0=", "another scene");
    do
    {
      int i;
      do
      {
        return;
        i = paramx.getType();
      }
      while ((i != 159) && (i != 160));
      if (i == 160)
        bl(this.huI);
    }
    while ((paramInt1 != 0) || (paramInt2 == 0));
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bmZ;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
    bg.qX().a(159, this);
    bg.qX().a(160, this);
    if (bg.qW().isSDCardAvailable())
    {
      com.tencent.mm.ad.k localk = new com.tencent.mm.ad.k(1);
      bg.qX().d(localk);
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.jOe != null)
    {
      bg.qX().c(this.jOe);
      s.yO().G(this.jOe.yI(), 1);
    }
    List localList = this.huI;
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      s.yO().G(localj.yI(), 1);
    }
    localList.clear();
    bg.qX().b(159, this);
    bg.qX().b(160, this);
    this.jOc.closeCursor();
    s.yO().h(this.jOc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsSelectBgUI
 * JD-Core Version:    0.6.2
 */