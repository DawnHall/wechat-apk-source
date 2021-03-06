package com.tencent.mm.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.kx;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.SwipeBackLayout.a;
import java.util.LinkedList;
import java.util.Locale;

public abstract class MMFragment extends FragmentActivitySupport
  implements View.OnAttachStateChangeListener, com.tencent.mm.ui.h.a
{
  protected static final int DEFAULT_TOAST_TIME = 3000;
  public static final String FLAG_OVERRIDE_ENTER_ANIMATION = "MMActivity.OverrideEnterAnimation";
  public static final String FLAG_OVERRIDE_EXIT_ANIMATION = "MMActivity.OverrideExitAnimation";
  private static final String TAG = "MicroMsg.MMFragment";
  private static final String TAG2 = "MicroMsg.INIT";
  String className;
  protected q mController = new q()
  {
    protected final String bJj()
    {
      AppMethodBeat.i(106042);
      String str = MMFragment.this.getIdentityString();
      AppMethodBeat.o(106042);
      return str;
    }

    protected final void dealContentView(View paramAnonymousView)
    {
      AppMethodBeat.i(106041);
      MMFragment.this.dealContentView(paramAnonymousView);
      AppMethodBeat.o(106041);
    }

    protected final boolean dxT()
    {
      return false;
    }

    protected final String getClassName()
    {
      AppMethodBeat.i(106046);
      String str = MMFragment.this.getClass().getName();
      AppMethodBeat.o(106046);
      return str;
    }

    protected final int getLayoutId()
    {
      AppMethodBeat.i(106040);
      int i = MMFragment.this.getLayoutId();
      AppMethodBeat.o(106040);
      return i;
    }

    protected final View getLayoutView()
    {
      AppMethodBeat.i(106043);
      View localView = MMFragment.this.getLayoutView();
      AppMethodBeat.o(106043);
      return localView;
    }

    public final boolean noActionBar()
    {
      AppMethodBeat.i(106047);
      boolean bool = MMFragment.this.noActionBar();
      AppMethodBeat.o(106047);
      return bool;
    }

    protected final void onCreateBeforeSetContentView()
    {
      AppMethodBeat.i(106045);
      MMFragment.this.onCreateBeforeSetContentView();
      AppMethodBeat.o(106045);
    }

    public final void onKeyboardStateChanged()
    {
      AppMethodBeat.i(106044);
      MMFragment.this.onKeyboardStateChanged();
      AppMethodBeat.o(106044);
    }
  };
  private boolean mCurVisible = false;
  private com.tencent.mm.ui.h.a mListener;
  protected AppCompatActivity mParent;
  private MMFragment mParentFragment;
  private boolean mParentVisible = false;
  private SwipeBackLayout mSwipeBackLayout;

  public MMFragment()
  {
  }

  public MMFragment(boolean paramBoolean)
  {
    super(paramBoolean);
  }

  private void filterAndNotifyVisibility(boolean paramBoolean)
  {
    filterAndNotifyVisibility(paramBoolean, false);
  }

  private void filterAndNotifyVisibility(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1 == this.mCurVisible)
      return;
    label21: boolean bool1;
    boolean bool2;
    if (this.mParentFragment == null)
    {
      paramBoolean1 = this.mParentVisible;
      bool1 = super.isVisible();
      bool2 = getUserVisibleHint();
      if ((!paramBoolean1) || (!bool1) || (!bool2) || (paramBoolean2))
        break label136;
    }
    label136: for (paramBoolean2 = true; ; paramBoolean2 = false)
    {
      ab.i("MicroMsg.MMFragment", "[filterAndNotifyVisibility] visible = %s parent = %s, super = %s, hint = %s name:%s", new Object[] { Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean1), Boolean.valueOf(bool1), Boolean.valueOf(bool2), getClass().getName() });
      if (paramBoolean2 == this.mCurVisible)
        break;
      this.mCurVisible = paramBoolean2;
      onVisibilityChanged(this.mCurVisible);
      break;
      paramBoolean1 = this.mParentFragment.isFragmentVisible();
      break label21;
    }
  }

  public static Locale initLanguage(Context paramContext)
  {
    return q.initLanguage(paramContext);
  }

  private void initSwipeBack()
  {
    View localView = getContentView();
    ViewGroup localViewGroup = (ViewGroup)localView.getParent();
    if (localViewGroup != null)
    {
      this.mSwipeBackLayout = ((SwipeBackLayout)LayoutInflater.from(thisActivity()).inflate(2130970910, localViewGroup, false));
      localViewGroup.removeView(localView);
      localViewGroup.addView(this.mSwipeBackLayout);
    }
    while (true)
    {
      this.mSwipeBackLayout.addView(localView);
      this.mSwipeBackLayout.setContentView(localView);
      this.mSwipeBackLayout.qX(true);
      this.mSwipeBackLayout.setSwipeGestureDelegate(new SwipeBackLayout.a()
      {
        public final void onCancel()
        {
          AppMethodBeat.i(106049);
          MMFragment.this.onCancelDrag();
          AppMethodBeat.o(106049);
        }

        public final void onDrag()
        {
          AppMethodBeat.i(106050);
          MMFragment.this.onDragBegin();
          AppMethodBeat.o(106050);
        }

        public final void onSwipeBack()
        {
          AppMethodBeat.i(106048);
          MMFragment.this.onSwipeBack();
          AppMethodBeat.o(106048);
        }
      });
      return;
      this.mSwipeBackLayout = ((SwipeBackLayout)LayoutInflater.from(thisActivity()).inflate(2130970910, null));
    }
  }

  public static void showVKB(Activity paramActivity)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)paramActivity.getSystemService("input_method");
    if (localInputMethodManager == null);
    while (true)
    {
      return;
      paramActivity = paramActivity.getCurrentFocus();
      if ((paramActivity != null) && (paramActivity.getWindowToken() != null))
        localInputMethodManager.toggleSoftInput(0, 2);
    }
  }

  public void activateBroadcast(boolean paramBoolean)
  {
    this.mController.activateBroadcast(paramBoolean);
  }

  public void addDialog(Dialog paramDialog)
  {
    this.mController.addDialog(paramDialog);
  }

  public void addIconOptionMenu(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addIconOptionMenu(paramInt1, paramInt2, paramInt3, paramOnMenuItemClickListener);
  }

  public void addIconOptionMenu(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    this.mController.addIconOptionMenu(paramInt1, paramInt2, paramInt3, paramOnMenuItemClickListener, paramOnLongClickListener);
  }

  public void addIconOptionMenu(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addIconOptionMenu(paramInt1, paramInt2, paramInt3, paramBoolean, paramOnMenuItemClickListener);
  }

  public void addIconOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addIconOptionMenu(paramInt1, paramInt2, paramOnMenuItemClickListener);
  }

  public void addIconOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt3)
  {
    q localq = this.mController;
    q.b localb = q.b.ymt;
    q.a locala = new q.a();
    locala.yfi = paramInt1;
    locala.ymp = paramInt3;
    locala.yfj = paramInt2;
    locala.text = "";
    locala.gzB = paramOnMenuItemClickListener;
    locala.mlV = null;
    locala.ymr = localb;
    locala.yms = false;
    if ((locala.yfj == 2130839555) && (bo.isNullOrNil("")))
      locala.text = localq.mContext.getString(2131296975);
    localq.Nf(locala.yfi);
    localq.yfa.add(locala);
    localq.supportInvalidateOptionsMenu();
  }

  public void addIconOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    this.mController.addIconOptionMenu(paramInt1, paramInt2, paramOnMenuItemClickListener, paramOnLongClickListener);
  }

  public void addIconOptionMenu(int paramInt1, String paramString, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addIconOptionMenu(paramInt1, paramString, paramInt2, paramOnMenuItemClickListener);
  }

  public void addSearchMenu(boolean paramBoolean, o paramo)
  {
    this.mController.addSearchMenu(paramBoolean, paramo);
  }

  public void addTextOptionMenu(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addTextOptionMenu(paramInt, paramString, paramOnMenuItemClickListener);
  }

  public void addTextOptionMenu(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    this.mController.a(paramInt, 0, paramString, false, paramOnMenuItemClickListener, paramOnLongClickListener, q.b.ymt);
  }

  public void addTextOptionMenu(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener, q.b paramb)
  {
    this.mController.addTextOptionMenu(paramInt, paramString, paramOnMenuItemClickListener, paramOnLongClickListener, paramb);
  }

  public boolean callBackMenu()
  {
    return this.mController.callBackMenu();
  }

  protected void dealContentView(View paramView)
  {
  }

  public void enableBackMenu(boolean paramBoolean)
  {
    this.mController.enableBackMenu(paramBoolean);
  }

  public void enableOptionMenu(int paramInt, boolean paramBoolean)
  {
    this.mController.d(false, paramInt, paramBoolean);
  }

  public void enableOptionMenu(boolean paramBoolean)
  {
    this.mController.d(true, -1, paramBoolean);
  }

  public q.a findMenuInfo(int paramInt)
  {
    return this.mController.Ng(paramInt);
  }

  public void finish()
  {
    super.finish();
    int i = thisActivity().getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", -1);
    int j = thisActivity().getIntent().getIntExtra("MMActivity.OverrideExitAnimation", -1);
    if (i != -1)
      getContext().overridePendingTransition(i, j);
  }

  public void fullScreenNoTitleBar(boolean paramBoolean)
  {
    this.mController.fullScreenNoTitleBar(paramBoolean);
  }

  public void fullScreenWithTitleBar(boolean paramBoolean)
  {
    q localq = this.mController;
    if (paramBoolean)
      localq.ylL.getWindow().setFlags(1024, 1024);
    while (true)
    {
      return;
      localq.ylL.getWindow().clearFlags(1024);
    }
  }

  public View getBodyView()
  {
    return this.mController.ylv;
  }

  protected final View getContentView()
  {
    return this.mController.contentView;
  }

  public final Activity getContext()
  {
    return this.mController.ylL;
  }

  public q getController()
  {
    return this.mController;
  }

  protected int getForceOrientation()
  {
    return -1;
  }

  public String getIdentityString()
  {
    return "";
  }

  public boolean getLandscapeMode()
  {
    return this.mController.getLandscapeMode();
  }

  protected abstract int getLayoutId();

  protected View getLayoutView()
  {
    return null;
  }

  public Resources getMMResources()
  {
    return thisActivity().getResources();
  }

  public String getMMString(int paramInt)
  {
    return thisActivity().getString(paramInt);
  }

  public String getMMString(int paramInt, Object[] paramArrayOfObject)
  {
    return thisActivity().getString(paramInt, paramArrayOfObject);
  }

  public CharSequence getMMTitle()
  {
    return this.mController.getMMTitle();
  }

  public int getStreamMaxVolume(int paramInt)
  {
    return this.mController.fZh.getStreamMaxVolume(paramInt);
  }

  public int getStreamVolume(int paramInt)
  {
    return this.mController.fZh.getStreamVolume(paramInt);
  }

  public SwipeBackLayout getSwipeBackLayout()
  {
    return this.mSwipeBackLayout;
  }

  public int getTitleLocation()
  {
    return this.mController.getTitleLocation();
  }

  public void hideTitleView()
  {
    this.mController.hideTitleView();
  }

  public boolean hideVKB()
  {
    return this.mController.hideVKB();
  }

  public boolean hideVKB(View paramView)
  {
    return this.mController.hideVKB(paramView);
  }

  public boolean interceptSupportInvalidateOptionsMenu()
  {
    if (this.mController.interceptSupportInvalidateOptionsMenu())
      this.mController.supportInvalidateOptionsMenu();
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isFragmentVisible()
  {
    return this.mCurVisible;
  }

  public boolean isScreenEnable()
  {
    return this.mController.ylz;
  }

  public boolean isSupportCustomActionBar()
  {
    return isSupportNavigationSwipeBack();
  }

  public final boolean isSupportNavigationSwipeBack()
  {
    if ((d.iW(19)) && (com.tencent.mm.compatible.i.b.Ml()));
    for (boolean bool = supportNavigationSwipeBack(); ; bool = false)
      return bool;
  }

  public boolean isTitleShowing()
  {
    return this.mController.isTitleShowing();
  }

  public int keyboardState()
  {
    return this.mController.ymc;
  }

  public boolean needShowIdcError()
  {
    return true;
  }

  public boolean noActionBar()
  {
    return false;
  }

  public void onAttach(Context paramContext)
  {
    super.onAttach(paramContext);
    paramContext = getParentFragment();
    if ((paramContext != null) && ((paramContext instanceof MMFragment)))
    {
      this.mParentFragment = ((MMFragment)paramContext);
      this.mParentFragment.setOnVisibilityChangedListener(this);
    }
    filterAndNotifyVisibility(true);
  }

  public void onCancelDrag()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.a(thisActivity().getBaseContext(), (AppCompatActivity)thisActivity());
  }

  protected void onCreateBeforeSetContentView()
  {
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    if (!this.mController.onCreateOptionsMenu(paramMenu))
      super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    setHasOptionsMenu(true);
    return getContentView();
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.mController.hq(getActivity());
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    getView().removeOnAttachStateChangeListener(this);
  }

  public void onDetach()
  {
    if (this.mParentFragment != null)
      this.mParentFragment.setOnVisibilityChangedListener(null);
    super.onDetach();
    filterAndNotifyVisibility(false);
    this.mParentFragment = null;
  }

  public void onDragBegin()
  {
  }

  public void onFragmentVisibilityChanged(boolean paramBoolean)
  {
    filterAndNotifyVisibility(paramBoolean);
  }

  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      filterAndNotifyVisibility(bool, paramBoolean);
      return;
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.mController.onKeyDown(paramInt, paramKeyEvent));
    for (boolean bool = true; ; bool = super.onKeyDown(paramInt, paramKeyEvent))
      return bool;
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.mController.onKeyUp(paramInt, paramKeyEvent));
    for (boolean bool = true; ; bool = super.onKeyUp(paramInt, paramKeyEvent))
      return bool;
  }

  public void onKeyboardStateChanged()
  {
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return this.mController.onOptionsItemSelected(paramMenuItem);
  }

  protected void onParentVisibilityChanged(boolean paramBoolean)
  {
    this.mParentVisible = paramBoolean;
    filterAndNotifyVisibility(paramBoolean);
  }

  public void onPause()
  {
    long l = System.currentTimeMillis();
    ac.bL(2, this.className);
    super.onPause();
    this.mController.onPause();
    ab.v("MicroMsg.INIT", "KEVIN MMActivity onPause:" + (System.currentTimeMillis() - l));
    onParentVisibilityChanged(false);
  }

  public void onPrepareOptionsMenu(Menu paramMenu)
  {
    this.mController.onPrepareOptionsMenu(paramMenu);
    super.onPrepareOptionsMenu(paramMenu);
  }

  public void onResume()
  {
    long l = System.currentTimeMillis();
    ac.bL(1, this.className);
    super.onResume();
    ab.v("MicroMsg.INIT", "KEVIN MMActivity super..onResume " + (System.currentTimeMillis() - l));
    this.mController.onResume();
    ab.v("MicroMsg.INIT", "KEVIN MMActivity onResume :" + (System.currentTimeMillis() - l));
    onParentVisibilityChanged(true);
  }

  public void onStart()
  {
    this.mController.onStart();
    super.onStart();
    onParentVisibilityChanged(true);
  }

  public void onStop()
  {
    super.onStop();
    onParentVisibilityChanged(false);
  }

  public void onSwipeBack()
  {
  }

  public void onViewAttachedToWindow(View paramView)
  {
    filterAndNotifyVisibility(true);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    if (isSupportNavigationSwipeBack())
      initSwipeBack();
    getView().addOnAttachStateChangeListener(this);
  }

  public void onViewDetachedFromWindow(View paramView)
  {
    filterAndNotifyVisibility(false);
  }

  protected void onVisibilityChanged(boolean paramBoolean)
  {
    if (this.mListener != null)
      this.mListener.onFragmentVisibilityChanged(paramBoolean);
    int i = -1;
    Object localObject = getArguments();
    int j = i;
    if (localObject != null)
    {
      j = i;
      if (((Bundle)localObject).containsKey(getClass().getName()))
        j = ((Bundle)localObject).getInt(getClass().getName());
    }
    ab.i("MicroMsg.MMFragment", "[onVisibilityChanged] visible:%s name:%s id:%s", new Object[] { Boolean.valueOf(paramBoolean), getClass().getName(), Integer.valueOf(j) });
    localObject = new kx();
    ((kx)localObject).cGP.name = getClass().getName();
    ((kx)localObject).cGP.id = j;
    ((kx)localObject).cGP.aIB = paramBoolean;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
  }

  public void removeAllOptionMenu()
  {
    this.mController.removeAllOptionMenu();
  }

  public boolean removeOptionMenu(int paramInt)
  {
    return this.mController.removeOptionMenu(paramInt);
  }

  public void setActivityController(q paramq)
  {
    if (paramq != null)
      this.mController = paramq;
  }

  public void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.setBackBtn(paramOnMenuItemClickListener, 0);
  }

  public void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    this.mController.setBackBtn(paramOnMenuItemClickListener, paramInt);
  }

  public void setBackGroundColorResource(int paramInt)
  {
    this.mController.setBackGroundColorResource(paramInt);
  }

  protected final void setBodyView(int paramInt)
  {
    q localq = this.mController;
    if (localq.yly == null)
      localq.yly = ((FrameLayout)localq.contentView.findViewById(2131825953));
    if (localq.ylw != null)
      localq.yly.removeView(localq.ylw);
    localq.yly.removeView(localq.ylv);
    localq.ylv = ((LayoutInflater)localq.mContext.getSystemService("layout_inflater")).inflate(paramInt, null);
    localq.yly.addView(localq.ylv, 0, new FrameLayout.LayoutParams(-1, -1));
    if (localq.ylw != null)
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, BackwardSupportUtil.b.b(localq.mContext, 47.0F));
      localq.yly.addView(localq.ylw, localq.yly.getChildCount(), localLayoutParams);
    }
    localq.yly.invalidate();
  }

  public void setMMSubTitle(int paramInt)
  {
    this.mController.setMMSubTitle(paramInt);
  }

  public void setMMSubTitle(String paramString)
  {
    this.mController.setMMSubTitle(paramString);
  }

  public void setMMSubTitleColor(int paramInt)
  {
  }

  public void setMMTitle(int paramInt)
  {
    this.mController.setMMTitle(paramInt);
  }

  public void setMMTitle(String paramString)
  {
    this.mController.setMMTitle(paramString);
  }

  public void setOnVisibilityChangedListener(com.tencent.mm.ui.h.a parama)
  {
    this.mListener = parama;
  }

  public void setParent(AppCompatActivity paramAppCompatActivity)
  {
    this.mParent = paramAppCompatActivity;
  }

  @Deprecated
  public void setRedDotVisibilty(int paramInt)
  {
  }

  public void setScreenEnable(boolean paramBoolean)
  {
    this.mController.setScreenEnable(paramBoolean);
  }

  public void setTitleBarDoubleClickListener(Runnable paramRunnable)
  {
    this.mController.setTitleBarDoubleClickListener(paramRunnable);
  }

  @Deprecated
  public void setTitleClickAction(GestureDetector.SimpleOnGestureListener paramSimpleOnGestureListener)
  {
  }

  public void setTitleLogo(int paramInt1, int paramInt2)
  {
    this.mController.setTitleLogo(paramInt1, paramInt2);
  }

  public void setTitleMuteIconVisibility(int paramInt)
  {
    this.mController.setTitleMuteIconVisibility(paramInt);
  }

  public void setTitlePhoneIconVisibility(int paramInt)
  {
    q localq = this.mController;
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      localq.ylK = bool;
      localq.dym();
      return;
    }
  }

  public void setTitleVisibility(int paramInt)
  {
    this.mController.setTitleVisibility(paramInt);
  }

  @Deprecated
  public void setToTop(View.OnClickListener paramOnClickListener)
  {
  }

  public void setUserVisibleHint(boolean paramBoolean)
  {
    ab.i("MicroMsg.MMFragment", "[setUserVisibleHint] isVisibleToUser:%s name:%s", new Object[] { Boolean.valueOf(paramBoolean), getClass().getName() });
    super.setUserVisibleHint(paramBoolean);
    filterAndNotifyVisibility(paramBoolean);
  }

  public void showHomeBtn(boolean paramBoolean)
  {
    this.mController.showHomeBtn(paramBoolean);
  }

  public void showOptionMenu(int paramInt, boolean paramBoolean)
  {
    this.mController.e(false, paramInt, paramBoolean);
  }

  public void showOptionMenu(boolean paramBoolean)
  {
    this.mController.e(true, -1, paramBoolean);
  }

  public void showTitleView()
  {
    this.mController.showTitleView();
  }

  public void showVKB()
  {
    q.showVKB(this.mController.ylL);
  }

  public void startActivity(Intent paramIntent)
  {
    startActivityReal(paramIntent);
  }

  public void startActivityReal(Intent paramIntent)
  {
    super.startActivity(paramIntent);
  }

  public boolean supportNavigationSwipeBack()
  {
    return true;
  }

  public FragmentActivity thisActivity()
  {
    if (this.mController.ylL != null);
    for (Object localObject = this.mController.ylL; ; localObject = super.getActivity())
      return localObject;
  }

  public Resources thisResources()
  {
    Object localObject = super.getActivity();
    if (localObject == null);
    for (localObject = ah.getContext().getResources(); ; localObject = ((FragmentActivity)localObject).getResources())
      return localObject;
  }

  public void updateDescription(String paramString)
  {
    this.mController.updateDescription(paramString);
  }

  public void updateOptionMenu(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    q localq = this.mController;
    localq.updateOptionMenuText(paramInt1, localq.ylL.getString(paramInt2));
    this.mController.updateOptionMenuIcon(paramInt1, paramInt3);
    this.mController.updateOptionMenuListener(paramInt1, paramOnMenuItemClickListener, null);
    this.mController.a(this.mController.Ng(paramInt1));
  }

  public void updateOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt3)
  {
    this.mController.updateOptionMenuIcon(paramInt1, paramInt2);
    this.mController.updateOptionMenuListener(paramInt1, paramOnMenuItemClickListener, null);
    q localq = this.mController;
    paramOnMenuItemClickListener = localq.Ng(paramInt1);
    if ((paramOnMenuItemClickListener != null) && (paramOnMenuItemClickListener.yfj != paramInt2))
    {
      paramOnMenuItemClickListener.yfj = paramInt2;
      paramOnMenuItemClickListener.ymp = paramInt3;
      localq.supportInvalidateOptionsMenu();
    }
    this.mController.a(this.mController.Ng(paramInt1));
  }

  public void updateOptionMenuIcon(int paramInt1, int paramInt2)
  {
    this.mController.updateOptionMenuIcon(paramInt1, paramInt2);
  }

  public void updateOptionMenuListener(int paramInt, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    this.mController.updateOptionMenuListener(paramInt, paramOnMenuItemClickListener, paramOnLongClickListener);
  }

  public void updateOptionMenuText(int paramInt, String paramString)
  {
    this.mController.updateOptionMenuText(paramInt, paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMFragment
 * JD-Core Version:    0.6.2
 */