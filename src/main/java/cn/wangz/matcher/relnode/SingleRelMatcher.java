package cn.wangz.matcher.relnode;

public class SingleRelMatcher implements RelMatcher {

    private RelMatcher single;

    public SingleRelMatcher(RelMatcher single) {
        this.single = single;
    }

    @Override
    public Boolean match() {
        return single.match();
    }
}
