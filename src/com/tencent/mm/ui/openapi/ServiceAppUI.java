package com.tencent.mm.ui.openapi;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.model.y;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import java.util.ArrayList;
import java.util.List;

public class ServiceAppUI extends MMPreference
  implements com.tencent.mm.o.m
{
  private String cEh;
  private com.tencent.mm.ui.base.preference.o dXi;
  private ServicePreference jKd;
  private ServicePreference jKe;
  private PreferenceTitleCategory jKf;
  private PreferenceTitleCategory jKg;
  private List jKh = new ArrayList();
  private List jKi = new ArrayList();
  private AdapterView.OnItemClickListener jKj;
  private AdapterView.OnItemClickListener jKk;

  protected final void DP()
  {
    oP(com.tencent.mm.n.ces);
    this.cEh = getIntent().getStringExtra("service_app_talker_user");
    a(new m(this));
    this.jKh.clear();
    this.jKi.clear();
    Cursor localCursor;
    if (y.dc(this.cEh))
    {
      localCursor = bf.GO().aH(0, 2);
      if (localCursor != null)
        if (!localCursor.moveToFirst());
    }
    label455: 
    while (true)
    {
      k localk = new k();
      localk.b(localCursor);
      if (localk.field_serviceAppType == 1)
        this.jKh.add(localk);
      while (true)
      {
        if (localCursor.moveToNext())
          break label455;
        localCursor.close();
        if (this.jKj == null)
          this.jKj = new n(this);
        if (this.jKk == null)
          this.jKk = new o(this);
        this.dXi = aTL();
        this.dXi.removeAll();
        if (this.jKh.size() > 0)
        {
          this.jKd = new ServicePreference(this);
          this.jKd.bk(this.jKh);
          if (this.jKj != null)
            this.jKd.setOnItemClickListener(this.jKj);
          if (this.jKf == null)
          {
            this.jKf = new PreferenceTitleCategory(this);
            this.jKf.setTitle(com.tencent.mm.n.cuq);
          }
          this.dXi.a(this.jKf);
          this.dXi.a(this.jKd);
        }
        if (this.jKi.size() > 0)
        {
          this.jKe = new ServicePreference(this);
          this.jKe.bk(this.jKi);
          if (this.jKk != null)
            this.jKe.setOnItemClickListener(this.jKk);
          if (this.jKg == null)
          {
            this.jKg = new PreferenceTitleCategory(this);
            this.jKg.setTitle(com.tencent.mm.n.bxC);
          }
          this.dXi.a(this.jKg);
          this.dXi.a(this.jKe);
        }
        return;
        if (y.dj(this.cEh))
        {
          localCursor = bf.GO().aH(0, 4);
          break;
        }
        localCursor = bf.GO().aH(0, 1);
        break;
        if (localk.field_serviceAppType == 2)
          this.jKi.add(localk);
      }
    }
  }

  public final int DZ()
  {
    return q.czP;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!32@/B4Tb64lLpICNjpbZsBI5qYbQsNvzDzA", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      return;
    z.e("!32@/B4Tb64lLpICNjpbZsBI5qYbQsNvzDzA", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
  }

  public final boolean a(com.tencent.mm.ui.base.preference.o paramo, Preference paramPreference)
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  protected void onPause()
  {
    super.onPause();
    if (this.jKd != null)
      this.jKd.onPause();
    if (this.jKe != null)
      this.jKe.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    DP();
    if (this.jKd != null)
      this.jKd.onResume();
    if (this.jKe != null)
      this.jKe.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.ServiceAppUI
 * JD-Core Version:    0.6.2
 */