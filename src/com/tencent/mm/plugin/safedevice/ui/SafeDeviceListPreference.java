package com.tencent.mm.plugin.safedevice.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.plugin.safedevice.a.d;
import com.tencent.mm.plugin.safedevice.a.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.Preference;

public class SafeDeviceListPreference extends Preference
  implements m
{
  private Context context;
  private ProgressDialog dWT;
  private Button ewr;
  private com.tencent.mm.plugin.safedevice.a.c fUj;
  private boolean fUk = false;
  private w fUl;
  private x fUm;
  private int mode = -2;

  public SafeDeviceListPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public SafeDeviceListPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SafeDeviceListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
  }

  private void DP()
  {
    if (!this.fUk)
      z.d("!56@/B4Tb64lLpI7vmNKcPQSbjdiTirNKc5cZ1XUPeYsvM6El4Pz5zkicw==", "has not binded");
    do
    {
      return;
      switch (this.mode)
      {
      case -1:
      case 0:
      default:
        setWidgetLayoutResource(k.bjA);
        return;
      case 1:
        setWidgetLayoutResource(k.bee);
      case -2:
      }
    }
    while (this.ewr == null);
    this.ewr.setOnClickListener(new v(this));
    return;
    setWidgetLayoutResource(k.bjA);
  }

  private void afp()
  {
    bg.qX().b(362, this);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    afp();
    if ((this.dWT != null) && (this.dWT.isShowing()))
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if ((paramInt2 == 0) && (paramInt2 == 0))
    {
      f.afl().b(this.fUj, new String[0]);
      if (this.fUm != null)
        this.fUm.pW(getKey());
    }
    do
    {
      do
        return;
      while (a.dWp.a(this.context, paramInt1, paramInt2, paramString));
      Context localContext1 = this.context;
      Context localContext2 = this.context;
      int i = n.cbJ;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      Toast.makeText(localContext1, localContext2.getString(i, arrayOfObject), 0).show();
    }
    while (this.fUl == null);
    this.fUl.pX(this.fUj.field_uid);
  }

  public final void a(w paramw)
  {
    this.fUl = paramw;
  }

  public final void a(x paramx)
  {
    this.fUm = paramx;
  }

  public final com.tencent.mm.plugin.safedevice.a.c afo()
  {
    return this.fUj;
  }

  public final void b(com.tencent.mm.plugin.safedevice.a.c paramc)
  {
    this.fUj = paramc;
  }

  public final void jx(int paramInt)
  {
    this.mode = paramInt;
    DP();
  }

  protected final void onBindView(View paramView)
  {
    this.fUk = true;
    this.ewr = ((Button)paramView.findViewById(i.apx));
    DP();
    super.onBindView(paramView);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    if (localViewGroup != null)
    {
      localViewGroup.removeAllViews();
      localLayoutInflater.inflate(k.bjl, localViewGroup);
    }
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.SafeDeviceListPreference
 * JD-Core Version:    0.6.2
 */