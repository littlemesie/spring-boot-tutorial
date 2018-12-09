# RESTful API 设计
1.get请求，url中的id可通过@PathVariable绑定到函数的参数中
例如：

@RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public String getUserId(@PathVariable("id") String id){
        // url中的id可通过@PathVariable绑定到函数的参数中
        return "用户id:" + id;
    }

2.post请求：@RequestParam从页面中传递参数，例如：

@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
    public String login(@RequestParam("id") String id, @RequestParam("name") String name) {
        // POST请求
        User user = new User();
        user.setId(id);
        user.setName(name);
        String res = JSON.toJSONString(user);
        System.out.println(res);
        return res;
    }

3.post请求：@ModelAttribute绑定参数

@RequestMapping(value = { "/login1" }, method = RequestMethod.POST)
    public String login1(@ModelAttribute User user) {
        // POST请求
        //@ModelAttribute绑定参数
        String u = JSON.toJSONString(user);
        System.out.println(user.getId());
        System.out.println(u);
        return u;
    }
