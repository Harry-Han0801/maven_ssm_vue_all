new Vue({
    el:"#app",
    data:{
        user : {},
        userList:[],
        pages : "",
        total : "",
        pageSize : null,
        prePage : null,
        nextPage : null,
        navigateFirstPage : null,
        navigateLastPage : null,
        pageNum : null
    },
    methods : {
        findAllUser : function () {
            var _this = this;
            var _pageSize = this.pageSize;
            var _pageNum = this.pageNum;
            axios.get("/maven_ssm_vue_all/user/select_all_user",{
                params : {
                    pageSize : _pageSize,
                    pageNum : _pageNum
                    }
                })
                .then(function (response) {
                    _this.userList = response.data.list;
                    console.log(response.data.list);
                    _this.pages = response.data.pages;
                    _this.total = response.data.total;
                    _this.prePage = response.data.prePage;
                    _this.nextPage = response.data.nextPage;
                    _this.navigateFirstPage = response.data.navigateFirstPage;
                    _this.navigateLastPage = response.data.navigateLastPage;

                })
                .catch(function (err) {
                    console.log(err);
                });
        },
        changePage :function(page){
            this.pageNum = page;
            this.findAllUser();
        },
        findById : function(uid){

        },
        update : function () {


        },
        updateUser : function () {
            this.pageSize=this.$refs.num.value;
            this.findAllUser();
        }
    },
    created : function () {
        this.findAllUser();
    }
});