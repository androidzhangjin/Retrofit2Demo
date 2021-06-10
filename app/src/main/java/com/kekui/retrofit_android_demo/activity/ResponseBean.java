package com.kekui.retrofit_android_demo.activity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseBean {

    /**
     * total_count : 1155
     * incomplete_results : false
     * items : [{"url":"https://api.github.com/repos/square/retrofit/commits/49e84530614cbd0fe2070f484754305b0c032e71","sha":"49e84530614cbd0fe2070f484754305b0c032e71","node_id":"MDY6Q29tbWl0ODkyMjc1OjQ5ZTg0NTMwNjE0Y2JkMGZlMjA3MGY0ODQ3NTQzMDViMGMwMzJlNzE=","html_url":"https://github.com/square/retrofit/commit/49e84530614cbd0fe2070f484754305b0c032e71","comments_url":"https://api.github.com/repos/square/retrofit/commits/49e84530614cbd0fe2070f484754305b0c032e71/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/49e84530614cbd0fe2070f484754305b0c032e71","author":{"date":"2021-02-09T09:55:49.000-06:00","name":"John Carlson","email":"jawnnypoo@gmail.com"},"committer":{"date":"2021-02-09T09:55:49.000-06:00","name":"GitHub","email":"noreply@github.com"},"message":"Fix broken r8/proguard link for OkHttp\n\nThe link was just taking you to the top of the OkHttp page instead of the R8/ProGuard section","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/e71842a58ac79a5d3ef00a14d9917e6f077036a7","sha":"e71842a58ac79a5d3ef00a14d9917e6f077036a7"},"comment_count":0},"author":{"login":"Jawnnypoo","id":1459320,"node_id":"MDQ6VXNlcjE0NTkzMjA=","avatar_url":"https://avatars.githubusercontent.com/u/1459320?v=4","gravatar_id":"","url":"https://api.github.com/users/Jawnnypoo","html_url":"https://github.com/Jawnnypoo","followers_url":"https://api.github.com/users/Jawnnypoo/followers","following_url":"https://api.github.com/users/Jawnnypoo/following{/other_user}","gists_url":"https://api.github.com/users/Jawnnypoo/gists{/gist_id}","starred_url":"https://api.github.com/users/Jawnnypoo/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Jawnnypoo/subscriptions","organizations_url":"https://api.github.com/users/Jawnnypoo/orgs","repos_url":"https://api.github.com/users/Jawnnypoo/repos","events_url":"https://api.github.com/users/Jawnnypoo/events{/privacy}","received_events_url":"https://api.github.com/users/Jawnnypoo/received_events","type":"User","site_admin":false},"committer":{"login":"web-flow","id":19864447,"node_id":"MDQ6VXNlcjE5ODY0NDQ3","avatar_url":"https://avatars.githubusercontent.com/u/19864447?v=4","gravatar_id":"","url":"https://api.github.com/users/web-flow","html_url":"https://github.com/web-flow","followers_url":"https://api.github.com/users/web-flow/followers","following_url":"https://api.github.com/users/web-flow/following{/other_user}","gists_url":"https://api.github.com/users/web-flow/gists{/gist_id}","starred_url":"https://api.github.com/users/web-flow/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/web-flow/subscriptions","organizations_url":"https://api.github.com/users/web-flow/orgs","repos_url":"https://api.github.com/users/web-flow/repos","events_url":"https://api.github.com/users/web-flow/events{/privacy}","received_events_url":"https://api.github.com/users/web-flow/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/2583d360fa39792f87faf7f69afefaadf3944536","html_url":"https://github.com/square/retrofit/commit/2583d360fa39792f87faf7f69afefaadf3944536","sha":"2583d360fa39792f87faf7f69afefaadf3944536"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/9562b46c222aeac64daa9539b2fcbcb3fb1d9184","sha":"9562b46c222aeac64daa9539b2fcbcb3fb1d9184","node_id":"MDY6Q29tbWl0ODkyMjc1Ojk1NjJiNDZjMjIyYWVhYzY0ZGFhOTUzOWIyZmNiY2IzZmIxZDkxODQ=","html_url":"https://github.com/square/retrofit/commit/9562b46c222aeac64daa9539b2fcbcb3fb1d9184","comments_url":"https://api.github.com/repos/square/retrofit/commits/9562b46c222aeac64daa9539b2fcbcb3fb1d9184/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/9562b46c222aeac64daa9539b2fcbcb3fb1d9184","author":{"date":"2020-12-10T10:42:29.000Z","name":"João Pinto","email":"joao.pinto@premium-minds.com"},"committer":{"date":"2020-12-10T10:42:29.000Z","name":"João Pinto","email":"joao.pinto@premium-minds.com"},"message":"Bump jackson-databind to 2.10.5.1","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/6d8455d730749b2a5a739983c4b47f19594fb557","sha":"6d8455d730749b2a5a739983c4b47f19594fb557"},"comment_count":0},"author":{"login":"JoaoPPinto","id":9551979,"node_id":"MDQ6VXNlcjk1NTE5Nzk=","avatar_url":"https://avatars.githubusercontent.com/u/9551979?v=4","gravatar_id":"","url":"https://api.github.com/users/JoaoPPinto","html_url":"https://github.com/JoaoPPinto","followers_url":"https://api.github.com/users/JoaoPPinto/followers","following_url":"https://api.github.com/users/JoaoPPinto/following{/other_user}","gists_url":"https://api.github.com/users/JoaoPPinto/gists{/gist_id}","starred_url":"https://api.github.com/users/JoaoPPinto/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JoaoPPinto/subscriptions","organizations_url":"https://api.github.com/users/JoaoPPinto/orgs","repos_url":"https://api.github.com/users/JoaoPPinto/repos","events_url":"https://api.github.com/users/JoaoPPinto/events{/privacy}","received_events_url":"https://api.github.com/users/JoaoPPinto/received_events","type":"User","site_admin":false},"committer":{"login":"JoaoPPinto","id":9551979,"node_id":"MDQ6VXNlcjk1NTE5Nzk=","avatar_url":"https://avatars.githubusercontent.com/u/9551979?v=4","gravatar_id":"","url":"https://api.github.com/users/JoaoPPinto","html_url":"https://github.com/JoaoPPinto","followers_url":"https://api.github.com/users/JoaoPPinto/followers","following_url":"https://api.github.com/users/JoaoPPinto/following{/other_user}","gists_url":"https://api.github.com/users/JoaoPPinto/gists{/gist_id}","starred_url":"https://api.github.com/users/JoaoPPinto/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JoaoPPinto/subscriptions","organizations_url":"https://api.github.com/users/JoaoPPinto/orgs","repos_url":"https://api.github.com/users/JoaoPPinto/repos","events_url":"https://api.github.com/users/JoaoPPinto/events{/privacy}","received_events_url":"https://api.github.com/users/JoaoPPinto/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/7128bf34c649daca5977b1fbf93f0278fab4267c","html_url":"https://github.com/square/retrofit/commit/7128bf34c649daca5977b1fbf93f0278fab4267c","sha":"7128bf34c649daca5977b1fbf93f0278fab4267c"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/b1838e19c4239f6aaa4b12f9dc93ca1a13027c3c","sha":"b1838e19c4239f6aaa4b12f9dc93ca1a13027c3c","node_id":"MDY6Q29tbWl0ODkyMjc1OmIxODM4ZTE5YzQyMzlmNmFhYTRiMTJmOWRjOTNjYTFhMTMwMjdjM2M=","html_url":"https://github.com/square/retrofit/commit/b1838e19c4239f6aaa4b12f9dc93ca1a13027c3c","comments_url":"https://api.github.com/repos/square/retrofit/commits/b1838e19c4239f6aaa4b12f9dc93ca1a13027c3c/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/b1838e19c4239f6aaa4b12f9dc93ca1a13027c3c","author":{"date":"2020-11-02T11:45:20.000+03:00","name":"Sinan Kozak","email":"sinan.kozak@scout24.com"},"committer":{"date":"2020-11-02T11:45:20.000+03:00","name":"Sinan Kozak","email":"sinan.kozak@scout24.com"},"message":"Update website Proguard rule section to be same as Readme","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/012d978b2d56436fab7494b965d7deeddcee7b7b","sha":"012d978b2d56436fab7494b965d7deeddcee7b7b"},"comment_count":0},"author":{"login":"kozaxinan","id":2559837,"node_id":"MDQ6VXNlcjI1NTk4Mzc=","avatar_url":"https://avatars.githubusercontent.com/u/2559837?v=4","gravatar_id":"","url":"https://api.github.com/users/kozaxinan","html_url":"https://github.com/kozaxinan","followers_url":"https://api.github.com/users/kozaxinan/followers","following_url":"https://api.github.com/users/kozaxinan/following{/other_user}","gists_url":"https://api.github.com/users/kozaxinan/gists{/gist_id}","starred_url":"https://api.github.com/users/kozaxinan/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/kozaxinan/subscriptions","organizations_url":"https://api.github.com/users/kozaxinan/orgs","repos_url":"https://api.github.com/users/kozaxinan/repos","events_url":"https://api.github.com/users/kozaxinan/events{/privacy}","received_events_url":"https://api.github.com/users/kozaxinan/received_events","type":"User","site_admin":false},"committer":{"login":"kozaxinan","id":2559837,"node_id":"MDQ6VXNlcjI1NTk4Mzc=","avatar_url":"https://avatars.githubusercontent.com/u/2559837?v=4","gravatar_id":"","url":"https://api.github.com/users/kozaxinan","html_url":"https://github.com/kozaxinan","followers_url":"https://api.github.com/users/kozaxinan/followers","following_url":"https://api.github.com/users/kozaxinan/following{/other_user}","gists_url":"https://api.github.com/users/kozaxinan/gists{/gist_id}","starred_url":"https://api.github.com/users/kozaxinan/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/kozaxinan/subscriptions","organizations_url":"https://api.github.com/users/kozaxinan/orgs","repos_url":"https://api.github.com/users/kozaxinan/repos","events_url":"https://api.github.com/users/kozaxinan/events{/privacy}","received_events_url":"https://api.github.com/users/kozaxinan/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/68126409cf93d58f65fc960f72817343053759ba","html_url":"https://github.com/square/retrofit/commit/68126409cf93d58f65fc960f72817343053759ba","sha":"68126409cf93d58f65fc960f72817343053759ba"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/d74cc59baba3733cea5f7063f659ec167056a72a","sha":"d74cc59baba3733cea5f7063f659ec167056a72a","node_id":"MDY6Q29tbWl0ODkyMjc1OmQ3NGNjNTliYWJhMzczM2NlYTVmNzA2M2Y2NTllYzE2NzA1NmE3MmE=","html_url":"https://github.com/square/retrofit/commit/d74cc59baba3733cea5f7063f659ec167056a72a","comments_url":"https://api.github.com/repos/square/retrofit/commits/d74cc59baba3733cea5f7063f659ec167056a72a/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/d74cc59baba3733cea5f7063f659ec167056a72a","author":{"date":"2020-10-19T22:18:01.000+02:00","name":"Hannes Gehrold","email":"62917820+h4n23s@users.noreply.github.com"},"committer":{"date":"2020-10-19T22:18:01.000+02:00","name":"GitHub","email":"noreply@github.com"},"message":"Fixing dead link","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/d8a4e36281f33026a7ae64169558d05c6ebe93e3","sha":"d8a4e36281f33026a7ae64169558d05c6ebe93e3"},"comment_count":0},"author":{"login":"h4n23s","id":62917820,"node_id":"MDQ6VXNlcjYyOTE3ODIw","avatar_url":"https://avatars.githubusercontent.com/u/62917820?v=4","gravatar_id":"","url":"https://api.github.com/users/h4n23s","html_url":"https://github.com/h4n23s","followers_url":"https://api.github.com/users/h4n23s/followers","following_url":"https://api.github.com/users/h4n23s/following{/other_user}","gists_url":"https://api.github.com/users/h4n23s/gists{/gist_id}","starred_url":"https://api.github.com/users/h4n23s/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/h4n23s/subscriptions","organizations_url":"https://api.github.com/users/h4n23s/orgs","repos_url":"https://api.github.com/users/h4n23s/repos","events_url":"https://api.github.com/users/h4n23s/events{/privacy}","received_events_url":"https://api.github.com/users/h4n23s/received_events","type":"User","site_admin":false},"committer":{"login":"web-flow","id":19864447,"node_id":"MDQ6VXNlcjE5ODY0NDQ3","avatar_url":"https://avatars.githubusercontent.com/u/19864447?v=4","gravatar_id":"","url":"https://api.github.com/users/web-flow","html_url":"https://github.com/web-flow","followers_url":"https://api.github.com/users/web-flow/followers","following_url":"https://api.github.com/users/web-flow/following{/other_user}","gists_url":"https://api.github.com/users/web-flow/gists{/gist_id}","starred_url":"https://api.github.com/users/web-flow/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/web-flow/subscriptions","organizations_url":"https://api.github.com/users/web-flow/orgs","repos_url":"https://api.github.com/users/web-flow/repos","events_url":"https://api.github.com/users/web-flow/events{/privacy}","received_events_url":"https://api.github.com/users/web-flow/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/576f23dae73814b23787322d8f663c4421af8939","html_url":"https://github.com/square/retrofit/commit/576f23dae73814b23787322d8f663c4421af8939","sha":"576f23dae73814b23787322d8f663c4421af8939"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/b377663c2863410a752300cc1ce039ddf5322c04","sha":"b377663c2863410a752300cc1ce039ddf5322c04","node_id":"MDY6Q29tbWl0ODkyMjc1OmIzNzc2NjNjMjg2MzQxMGE3NTIzMDBjYzFjZTAzOWRkZjUzMjJjMDQ=","html_url":"https://github.com/square/retrofit/commit/b377663c2863410a752300cc1ce039ddf5322c04","comments_url":"https://api.github.com/repos/square/retrofit/commits/b377663c2863410a752300cc1ce039ddf5322c04/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/b377663c2863410a752300cc1ce039ddf5322c04","author":{"date":"2020-09-15T11:21:11.000-04:00","name":"Jake Wharton","email":"jw@squareup.com"},"committer":{"date":"2020-09-15T11:38:30.000-04:00","name":"Jake Wharton","email":"jw@squareup.com"},"message":"Java 15 final\n\nGradle 6.7 RC1 for offical Java 15 support","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/9ebb74b9a18fb72e24ef9ee94d7a9c26115a62b4","sha":"9ebb74b9a18fb72e24ef9ee94d7a9c26115a62b4"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/65de04d1da61f9e8124956f6fff8902fc81d05e2","html_url":"https://github.com/square/retrofit/commit/65de04d1da61f9e8124956f6fff8902fc81d05e2","sha":"65de04d1da61f9e8124956f6fff8902fc81d05e2"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/56e15f806198c18a17dc3407a013fcc1652f1b01","sha":"56e15f806198c18a17dc3407a013fcc1652f1b01","node_id":"MDY6Q29tbWl0ODkyMjc1OjU2ZTE1ZjgwNjE5OGMxOGExN2RjMzQwN2EwMTNmY2MxNjUyZjFiMDE=","html_url":"https://github.com/square/retrofit/commit/56e15f806198c18a17dc3407a013fcc1652f1b01","comments_url":"https://api.github.com/repos/square/retrofit/commits/56e15f806198c18a17dc3407a013fcc1652f1b01/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/56e15f806198c18a17dc3407a013fcc1652f1b01","author":{"date":"2020-06-12T14:44:58.000+10:00","name":"clydebarrow","email":"2366188+clydebarrow@users.noreply.github.com"},"committer":{"date":"2020-06-17T23:11:42.000-04:00","name":"Jake Wharton","email":"jw@squareup.com"},"message":"Prevent use of Java 8 features on RoboVM","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/8b817595c0a1e82188e8bae2afc1d10af910c3be","sha":"8b817595c0a1e82188e8bae2afc1d10af910c3be"},"comment_count":0},"author":{"login":"clydebarrow","id":2366188,"node_id":"MDQ6VXNlcjIzNjYxODg=","avatar_url":"https://avatars.githubusercontent.com/u/2366188?v=4","gravatar_id":"","url":"https://api.github.com/users/clydebarrow","html_url":"https://github.com/clydebarrow","followers_url":"https://api.github.com/users/clydebarrow/followers","following_url":"https://api.github.com/users/clydebarrow/following{/other_user}","gists_url":"https://api.github.com/users/clydebarrow/gists{/gist_id}","starred_url":"https://api.github.com/users/clydebarrow/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/clydebarrow/subscriptions","organizations_url":"https://api.github.com/users/clydebarrow/orgs","repos_url":"https://api.github.com/users/clydebarrow/repos","events_url":"https://api.github.com/users/clydebarrow/events{/privacy}","received_events_url":"https://api.github.com/users/clydebarrow/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/9e597f2525d6ff0c06b2e836869a0328a2e0b388","html_url":"https://github.com/square/retrofit/commit/9e597f2525d6ff0c06b2e836869a0328a2e0b388","sha":"9e597f2525d6ff0c06b2e836869a0328a2e0b388"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/61a71e2b355994bcb09b858d4df9e31341fdc933","sha":"61a71e2b355994bcb09b858d4df9e31341fdc933","node_id":"MDY6Q29tbWl0ODkyMjc1OjYxYTcxZTJiMzU1OTk0YmNiMDliODU4ZDRkZjllMzEzNDFmZGM5MzM=","html_url":"https://github.com/square/retrofit/commit/61a71e2b355994bcb09b858d4df9e31341fdc933","comments_url":"https://api.github.com/repos/square/retrofit/commits/61a71e2b355994bcb09b858d4df9e31341fdc933/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/61a71e2b355994bcb09b858d4df9e31341fdc933","author":{"date":"2020-06-08T19:53:05.000-04:00","name":"Jake Wharton","email":"jw@squareup.com"},"committer":{"date":"2020-06-08T19:53:05.000-04:00","name":"Jake Wharton","email":"jw@squareup.com"},"message":"Update google-java-format to 1.8","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/86949dbd41363ce94846e25003395b13bee0279b","sha":"86949dbd41363ce94846e25003395b13bee0279b"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/bc119896a328cb314df279b26cc68eebd19c4b31","html_url":"https://github.com/square/retrofit/commit/bc119896a328cb314df279b26cc68eebd19c4b31","sha":"bc119896a328cb314df279b26cc68eebd19c4b31"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/dd6d7abc7eb41435ef291243e12fce19f8d4471c","sha":"dd6d7abc7eb41435ef291243e12fce19f8d4471c","node_id":"MDY6Q29tbWl0ODkyMjc1OmRkNmQ3YWJjN2ViNDE0MzVlZjI5MTI0M2UxMmZjZTE5ZjhkNDQ3MWM=","html_url":"https://github.com/square/retrofit/commit/dd6d7abc7eb41435ef291243e12fce19f8d4471c","comments_url":"https://api.github.com/repos/square/retrofit/commits/dd6d7abc7eb41435ef291243e12fce19f8d4471c/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/dd6d7abc7eb41435ef291243e12fce19f8d4471c","author":{"date":"2020-05-30T13:37:30.000+02:00","name":"Sebastien Guillemin","email":"sebastien.guillemin@gmail.com"},"committer":{"date":"2020-05-30T13:37:30.000+02:00","name":"GitHub","email":"noreply@github.com"},"message":"Fix typo","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/4446014778a481d1f5233a7d5816f68e81affa94","sha":"4446014778a481d1f5233a7d5816f68e81affa94"},"comment_count":0},"author":{"login":"mrlem","id":5683197,"node_id":"MDQ6VXNlcjU2ODMxOTc=","avatar_url":"https://avatars.githubusercontent.com/u/5683197?v=4","gravatar_id":"","url":"https://api.github.com/users/mrlem","html_url":"https://github.com/mrlem","followers_url":"https://api.github.com/users/mrlem/followers","following_url":"https://api.github.com/users/mrlem/following{/other_user}","gists_url":"https://api.github.com/users/mrlem/gists{/gist_id}","starred_url":"https://api.github.com/users/mrlem/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/mrlem/subscriptions","organizations_url":"https://api.github.com/users/mrlem/orgs","repos_url":"https://api.github.com/users/mrlem/repos","events_url":"https://api.github.com/users/mrlem/events{/privacy}","received_events_url":"https://api.github.com/users/mrlem/received_events","type":"User","site_admin":false},"committer":{"login":"web-flow","id":19864447,"node_id":"MDQ6VXNlcjE5ODY0NDQ3","avatar_url":"https://avatars.githubusercontent.com/u/19864447?v=4","gravatar_id":"","url":"https://api.github.com/users/web-flow","html_url":"https://github.com/web-flow","followers_url":"https://api.github.com/users/web-flow/followers","following_url":"https://api.github.com/users/web-flow/following{/other_user}","gists_url":"https://api.github.com/users/web-flow/gists{/gist_id}","starred_url":"https://api.github.com/users/web-flow/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/web-flow/subscriptions","organizations_url":"https://api.github.com/users/web-flow/orgs","repos_url":"https://api.github.com/users/web-flow/repos","events_url":"https://api.github.com/users/web-flow/events{/privacy}","received_events_url":"https://api.github.com/users/web-flow/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/c6f21c3c3cd0b101e924bd2ba11a4774a3d96695","html_url":"https://github.com/square/retrofit/commit/c6f21c3c3cd0b101e924bd2ba11a4774a3d96695","sha":"c6f21c3c3cd0b101e924bd2ba11a4774a3d96695"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/6116b581e50b80b7f60dd74b9ebc7ac1a3c9288a","sha":"6116b581e50b80b7f60dd74b9ebc7ac1a3c9288a","node_id":"MDY6Q29tbWl0ODkyMjc1OjYxMTZiNTgxZTUwYjgwYjdmNjBkZDc0YjllYmM3YWMxYTNjOTI4OGE=","html_url":"https://github.com/square/retrofit/commit/6116b581e50b80b7f60dd74b9ebc7ac1a3c9288a","comments_url":"https://api.github.com/repos/square/retrofit/commits/6116b581e50b80b7f60dd74b9ebc7ac1a3c9288a/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/6116b581e50b80b7f60dd74b9ebc7ac1a3c9288a","author":{"date":"2020-05-29T19:58:18.000-04:00","name":"Jake Wharton","email":"jw@squareup.com"},"committer":{"date":"2020-05-29T19:58:18.000-04:00","name":"Jake Wharton","email":"jw@squareup.com"},"message":"Error-prone 2.4.0","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/caa02302cdd28a0694a2833fd26fd0084dbc0d2d","sha":"caa02302cdd28a0694a2833fd26fd0084dbc0d2d"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/96f68b5242c32f8509277a2d932108ca6bd17222","html_url":"https://github.com/square/retrofit/commit/96f68b5242c32f8509277a2d932108ca6bd17222","sha":"96f68b5242c32f8509277a2d932108ca6bd17222"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/8bc121fc2b2c49559a6f17b92d053cfa72c93e26","sha":"8bc121fc2b2c49559a6f17b92d053cfa72c93e26","node_id":"MDY6Q29tbWl0ODkyMjc1OjhiYzEyMWZjMmIyYzQ5NTU5YTZmMTdiOTJkMDUzY2ZhNzJjOTNlMjY=","html_url":"https://github.com/square/retrofit/commit/8bc121fc2b2c49559a6f17b92d053cfa72c93e26","comments_url":"https://api.github.com/repos/square/retrofit/commits/8bc121fc2b2c49559a6f17b92d053cfa72c93e26/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/8bc121fc2b2c49559a6f17b92d053cfa72c93e26","author":{"date":"2020-05-26T13:28:19.000+02:00","name":"Brais Gabín","email":"braisgabin@gmail.com"},"committer":{"date":"2020-05-26T13:28:19.000+02:00","name":"GitHub","email":"noreply@github.com"},"message":"Fix typo","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/d02c807eb179db1e6d36d5879d7869fb08abff70","sha":"d02c807eb179db1e6d36d5879d7869fb08abff70"},"comment_count":0},"author":{"login":"BraisGabin","id":721244,"node_id":"MDQ6VXNlcjcyMTI0NA==","avatar_url":"https://avatars.githubusercontent.com/u/721244?v=4","gravatar_id":"","url":"https://api.github.com/users/BraisGabin","html_url":"https://github.com/BraisGabin","followers_url":"https://api.github.com/users/BraisGabin/followers","following_url":"https://api.github.com/users/BraisGabin/following{/other_user}","gists_url":"https://api.github.com/users/BraisGabin/gists{/gist_id}","starred_url":"https://api.github.com/users/BraisGabin/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/BraisGabin/subscriptions","organizations_url":"https://api.github.com/users/BraisGabin/orgs","repos_url":"https://api.github.com/users/BraisGabin/repos","events_url":"https://api.github.com/users/BraisGabin/events{/privacy}","received_events_url":"https://api.github.com/users/BraisGabin/received_events","type":"User","site_admin":false},"committer":{"login":"web-flow","id":19864447,"node_id":"MDQ6VXNlcjE5ODY0NDQ3","avatar_url":"https://avatars.githubusercontent.com/u/19864447?v=4","gravatar_id":"","url":"https://api.github.com/users/web-flow","html_url":"https://github.com/web-flow","followers_url":"https://api.github.com/users/web-flow/followers","following_url":"https://api.github.com/users/web-flow/following{/other_user}","gists_url":"https://api.github.com/users/web-flow/gists{/gist_id}","starred_url":"https://api.github.com/users/web-flow/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/web-flow/subscriptions","organizations_url":"https://api.github.com/users/web-flow/orgs","repos_url":"https://api.github.com/users/web-flow/repos","events_url":"https://api.github.com/users/web-flow/events{/privacy}","received_events_url":"https://api.github.com/users/web-flow/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/f62316b74b862900abcd1ed1d5a12d01b01d3a3b","html_url":"https://github.com/square/retrofit/commit/f62316b74b862900abcd1ed1d5a12d01b01d3a3b","sha":"f62316b74b862900abcd1ed1d5a12d01b01d3a3b"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/abbc36f5bdd593b7ca5c14d1b633d851b2174f94","sha":"abbc36f5bdd593b7ca5c14d1b633d851b2174f94","node_id":"MDY6Q29tbWl0ODkyMjc1OmFiYmMzNmY1YmRkNTkzYjdjYTVjMTRkMWI2MzNkODUxYjIxNzRmOTQ=","html_url":"https://github.com/square/retrofit/commit/abbc36f5bdd593b7ca5c14d1b633d851b2174f94","comments_url":"https://api.github.com/repos/square/retrofit/commits/abbc36f5bdd593b7ca5c14d1b633d851b2174f94/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/abbc36f5bdd593b7ca5c14d1b633d851b2174f94","author":{"date":"2020-05-21T10:51:09.000+02:00","name":"Paul Woitaschek","email":"woitaschek@posteo.de"},"committer":{"date":"2020-05-21T10:51:09.000+02:00","name":"GitHub","email":"noreply@github.com"},"message":"Use https for the apache license","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/3e39ea7d546581617ca76ecbdc82580e710925fa","sha":"3e39ea7d546581617ca76ecbdc82580e710925fa"},"comment_count":0},"author":{"login":"PaulWoitaschek","id":743462,"node_id":"MDQ6VXNlcjc0MzQ2Mg==","avatar_url":"https://avatars.githubusercontent.com/u/743462?v=4","gravatar_id":"","url":"https://api.github.com/users/PaulWoitaschek","html_url":"https://github.com/PaulWoitaschek","followers_url":"https://api.github.com/users/PaulWoitaschek/followers","following_url":"https://api.github.com/users/PaulWoitaschek/following{/other_user}","gists_url":"https://api.github.com/users/PaulWoitaschek/gists{/gist_id}","starred_url":"https://api.github.com/users/PaulWoitaschek/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/PaulWoitaschek/subscriptions","organizations_url":"https://api.github.com/users/PaulWoitaschek/orgs","repos_url":"https://api.github.com/users/PaulWoitaschek/repos","events_url":"https://api.github.com/users/PaulWoitaschek/events{/privacy}","received_events_url":"https://api.github.com/users/PaulWoitaschek/received_events","type":"User","site_admin":false},"committer":{"login":"web-flow","id":19864447,"node_id":"MDQ6VXNlcjE5ODY0NDQ3","avatar_url":"https://avatars.githubusercontent.com/u/19864447?v=4","gravatar_id":"","url":"https://api.github.com/users/web-flow","html_url":"https://github.com/web-flow","followers_url":"https://api.github.com/users/web-flow/followers","following_url":"https://api.github.com/users/web-flow/following{/other_user}","gists_url":"https://api.github.com/users/web-flow/gists{/gist_id}","starred_url":"https://api.github.com/users/web-flow/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/web-flow/subscriptions","organizations_url":"https://api.github.com/users/web-flow/orgs","repos_url":"https://api.github.com/users/web-flow/repos","events_url":"https://api.github.com/users/web-flow/events{/privacy}","received_events_url":"https://api.github.com/users/web-flow/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/b1a903eb74691c86ff837c4bc88d0bc30f146b87","html_url":"https://github.com/square/retrofit/commit/b1a903eb74691c86ff837c4bc88d0bc30f146b87","sha":"b1a903eb74691c86ff837c4bc88d0bc30f146b87"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/b1a903eb74691c86ff837c4bc88d0bc30f146b87","sha":"b1a903eb74691c86ff837c4bc88d0bc30f146b87","node_id":"MDY6Q29tbWl0ODkyMjc1OmIxYTkwM2ViNzQ2OTFjODZmZjgzN2M0YmM4OGQwYmMzMGYxNDZiODc=","html_url":"https://github.com/square/retrofit/commit/b1a903eb74691c86ff837c4bc88d0bc30f146b87","comments_url":"https://api.github.com/repos/square/retrofit/commits/b1a903eb74691c86ff837c4bc88d0bc30f146b87/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/b1a903eb74691c86ff837c4bc88d0bc30f146b87","author":{"date":"2020-05-20T12:25:37.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"committer":{"date":"2020-05-20T12:25:37.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"message":"Prepare next development version","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/7711621e3d410c93181f6b3c715231ca067167a5","sha":"7711621e3d410c93181f6b3c715231ca067167a5"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/bd33a5da186aa6f5365e78e27eb0292b1b8b1bff","html_url":"https://github.com/square/retrofit/commit/bd33a5da186aa6f5365e78e27eb0292b1b8b1bff","sha":"bd33a5da186aa6f5365e78e27eb0292b1b8b1bff"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/bd33a5da186aa6f5365e78e27eb0292b1b8b1bff","sha":"bd33a5da186aa6f5365e78e27eb0292b1b8b1bff","node_id":"MDY6Q29tbWl0ODkyMjc1OmJkMzNhNWRhMTg2YWE2ZjUzNjVlNzhlMjdlYjAyOTJiMWI4YjFiZmY=","html_url":"https://github.com/square/retrofit/commit/bd33a5da186aa6f5365e78e27eb0292b1b8b1bff","comments_url":"https://api.github.com/repos/square/retrofit/commits/bd33a5da186aa6f5365e78e27eb0292b1b8b1bff/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/bd33a5da186aa6f5365e78e27eb0292b1b8b1bff","author":{"date":"2020-05-20T12:16:17.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"committer":{"date":"2020-05-20T12:16:17.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"message":"Prepare version 2.9.0","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/7fb1feab435b5b37b2b0a572a7ac9d33085e9b81","sha":"7fb1feab435b5b37b2b0a572a7ac9d33085e9b81"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/762f59009b2b0c84fdeeed00d6174c53a3b57f59","html_url":"https://github.com/square/retrofit/commit/762f59009b2b0c84fdeeed00d6174c53a3b57f59","sha":"762f59009b2b0c84fdeeed00d6174c53a3b57f59"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/762f59009b2b0c84fdeeed00d6174c53a3b57f59","sha":"762f59009b2b0c84fdeeed00d6174c53a3b57f59","node_id":"MDY6Q29tbWl0ODkyMjc1Ojc2MmY1OTAwOWIyYjBjODRmZGVlZWQwMGQ2MTc0YzUzYTNiNTdmNTk=","html_url":"https://github.com/square/retrofit/commit/762f59009b2b0c84fdeeed00d6174c53a3b57f59","comments_url":"https://api.github.com/repos/square/retrofit/commits/762f59009b2b0c84fdeeed00d6174c53a3b57f59/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/762f59009b2b0c84fdeeed00d6174c53a3b57f59","author":{"date":"2020-05-20T12:12:59.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"committer":{"date":"2020-05-20T12:12:59.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"message":"Add releasing steps","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/63e1fec5faff444220dfc88a56562b17dbff1b0b","sha":"63e1fec5faff444220dfc88a56562b17dbff1b0b"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/87966950ed14ba06c59d8063f884aa2bcc7dbb01","html_url":"https://github.com/square/retrofit/commit/87966950ed14ba06c59d8063f884aa2bcc7dbb01","sha":"87966950ed14ba06c59d8063f884aa2bcc7dbb01"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/1078fd1baf9061d30e519c8a3944349132070db0","sha":"1078fd1baf9061d30e519c8a3944349132070db0","node_id":"MDY6Q29tbWl0ODkyMjc1OjEwNzhmZDFiYWY5MDYxZDMwZTUxOWM4YTM5NDQzNDkxMzIwNzBkYjA=","html_url":"https://github.com/square/retrofit/commit/1078fd1baf9061d30e519c8a3944349132070db0","comments_url":"https://api.github.com/repos/square/retrofit/commits/1078fd1baf9061d30e519c8a3944349132070db0/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/1078fd1baf9061d30e519c8a3944349132070db0","author":{"date":"2020-05-18T15:34:13.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"committer":{"date":"2020-05-18T15:34:13.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"message":"Prepare next development version","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/d9e3031effa85c1e92af60d0e889211fd4d001cc","sha":"d9e3031effa85c1e92af60d0e889211fd4d001cc"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/16205e9c60708183a5bdca923f2bd723636d57a9","html_url":"https://github.com/square/retrofit/commit/16205e9c60708183a5bdca923f2bd723636d57a9","sha":"16205e9c60708183a5bdca923f2bd723636d57a9"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/16205e9c60708183a5bdca923f2bd723636d57a9","sha":"16205e9c60708183a5bdca923f2bd723636d57a9","node_id":"MDY6Q29tbWl0ODkyMjc1OjE2MjA1ZTljNjA3MDgxODNhNWJkY2E5MjNmMmJkNzIzNjM2ZDU3YTk=","html_url":"https://github.com/square/retrofit/commit/16205e9c60708183a5bdca923f2bd723636d57a9","comments_url":"https://api.github.com/repos/square/retrofit/commits/16205e9c60708183a5bdca923f2bd723636d57a9/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/16205e9c60708183a5bdca923f2bd723636d57a9","author":{"date":"2020-05-18T15:23:22.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"committer":{"date":"2020-05-18T15:23:22.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"message":"Add pom descriptions for each deployed artifact","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/c3afdd8be86e332b80258537c0f44a9c059ff58f","sha":"c3afdd8be86e332b80258537c0f44a9c059ff58f"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/9710e643f020c8b78ef3061992ffc04aafc087a3","html_url":"https://github.com/square/retrofit/commit/9710e643f020c8b78ef3061992ffc04aafc087a3","sha":"9710e643f020c8b78ef3061992ffc04aafc087a3"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/9710e643f020c8b78ef3061992ffc04aafc087a3","sha":"9710e643f020c8b78ef3061992ffc04aafc087a3","node_id":"MDY6Q29tbWl0ODkyMjc1Ojk3MTBlNjQzZjAyMGM4Yjc4ZWYzMDYxOTkyZmZjMDRhYWZjMDg3YTM=","html_url":"https://github.com/square/retrofit/commit/9710e643f020c8b78ef3061992ffc04aafc087a3","comments_url":"https://api.github.com/repos/square/retrofit/commits/9710e643f020c8b78ef3061992ffc04aafc087a3/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/9710e643f020c8b78ef3061992ffc04aafc087a3","author":{"date":"2020-05-18T14:43:57.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"committer":{"date":"2020-05-18T14:43:57.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"message":"Prepare version 2.8.2","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/e748bafd1f8e9234ff1ee83f613aad6d5a291225","sha":"e748bafd1f8e9234ff1ee83f613aad6d5a291225"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/8e3843137902997c087bb62683a39e3bd21b1a58","html_url":"https://github.com/square/retrofit/commit/8e3843137902997c087bb62683a39e3bd21b1a58","sha":"8e3843137902997c087bb62683a39e3bd21b1a58"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/b570461655d0926705fdd6a6135cad951746458d","sha":"b570461655d0926705fdd6a6135cad951746458d","node_id":"MDY6Q29tbWl0ODkyMjc1OmI1NzA0NjE2NTVkMDkyNjcwNWZkZDZhNjEzNWNhZDk1MTc0NjQ1OGQ=","html_url":"https://github.com/square/retrofit/commit/b570461655d0926705fdd6a6135cad951746458d","comments_url":"https://api.github.com/repos/square/retrofit/commits/b570461655d0926705fdd6a6135cad951746458d/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/b570461655d0926705fdd6a6135cad951746458d","author":{"date":"2020-05-17T17:10:43.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"committer":{"date":"2020-05-17T17:10:43.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"message":"OkHttp 3.14.9\n\nThis contains the fix for Android detection on the OkHttp side.","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/a2f30397c2d1a1fc21fbb9bf1b0d29c477c03218","sha":"a2f30397c2d1a1fc21fbb9bf1b0d29c477c03218"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/d80636923c595ed665adc6066f1377a6a1304f6a","html_url":"https://github.com/square/retrofit/commit/d80636923c595ed665adc6066f1377a6a1304f6a","sha":"d80636923c595ed665adc6066f1377a6a1304f6a"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/d80636923c595ed665adc6066f1377a6a1304f6a","sha":"d80636923c595ed665adc6066f1377a6a1304f6a","node_id":"MDY6Q29tbWl0ODkyMjc1OmQ4MDYzNjkyM2M1OTVlZDY2NWFkYzYwNjZmMTM3N2E2YTEzMDRmNmE=","html_url":"https://github.com/square/retrofit/commit/d80636923c595ed665adc6066f1377a6a1304f6a","comments_url":"https://api.github.com/repos/square/retrofit/commits/d80636923c595ed665adc6066f1377a6a1304f6a/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/d80636923c595ed665adc6066f1377a6a1304f6a","author":{"date":"2020-05-16T13:36:13.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"committer":{"date":"2020-05-16T13:36:15.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"message":"Move source/target config out of error-prone block\n\nError-prone only works on pre-12 at the moment and we need this configuration to apply for all JDKs.","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/9ed3f84db2a36503e0f137dbc9b6797849ef226b","sha":"9ed3f84db2a36503e0f137dbc9b6797849ef226b"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/c301cc8b42a7bd12c17572a716e3fc6394b95f66","html_url":"https://github.com/square/retrofit/commit/c301cc8b42a7bd12c17572a716e3fc6394b95f66","sha":"c301cc8b42a7bd12c17572a716e3fc6394b95f66"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/467764b9761f800ce6e227f6f14b38ec47c09365","sha":"467764b9761f800ce6e227f6f14b38ec47c09365","node_id":"MDY6Q29tbWl0ODkyMjc1OjQ2Nzc2NGI5NzYxZjgwMGNlNmUyMjdmNmYxNGIzOGVjNDdjMDkzNjU=","html_url":"https://github.com/square/retrofit/commit/467764b9761f800ce6e227f6f14b38ec47c09365","comments_url":"https://api.github.com/repos/square/retrofit/commits/467764b9761f800ce6e227f6f14b38ec47c09365/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/467764b9761f800ce6e227f6f14b38ec47c09365","author":{"date":"2020-04-29T12:57:20.000+08:00","name":"ctlove0523","email":"478309639@qq.com"},"committer":{"date":"2020-05-20T11:52:54.000-04:00","name":"Jake Wharton","email":"jakewharton@gmail.com"},"message":"Update Maven references to Gradle","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/02d821eb4895d74bb508ff35988c3b7a7f4e8d4a","sha":"02d821eb4895d74bb508ff35988c3b7a7f4e8d4a"},"comment_count":0},"author":{"login":"ctlove0523","id":9432235,"node_id":"MDQ6VXNlcjk0MzIyMzU=","avatar_url":"https://avatars.githubusercontent.com/u/9432235?v=4","gravatar_id":"","url":"https://api.github.com/users/ctlove0523","html_url":"https://github.com/ctlove0523","followers_url":"https://api.github.com/users/ctlove0523/followers","following_url":"https://api.github.com/users/ctlove0523/following{/other_user}","gists_url":"https://api.github.com/users/ctlove0523/gists{/gist_id}","starred_url":"https://api.github.com/users/ctlove0523/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/ctlove0523/subscriptions","organizations_url":"https://api.github.com/users/ctlove0523/orgs","repos_url":"https://api.github.com/users/ctlove0523/repos","events_url":"https://api.github.com/users/ctlove0523/events{/privacy}","received_events_url":"https://api.github.com/users/ctlove0523/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/ab1d46dd871decf8432b49c238806785cbfcc845","html_url":"https://github.com/square/retrofit/commit/ab1d46dd871decf8432b49c238806785cbfcc845","sha":"ab1d46dd871decf8432b49c238806785cbfcc845"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/bcf07d0dffefb4ca1a33d431f5d38cab888b7d11","sha":"bcf07d0dffefb4ca1a33d431f5d38cab888b7d11","node_id":"MDY6Q29tbWl0ODkyMjc1OmJjZjA3ZDBkZmZlZmI0Y2ExYTMzZDQzMWY1ZDM4Y2FiODg4YjdkMTE=","html_url":"https://github.com/square/retrofit/commit/bcf07d0dffefb4ca1a33d431f5d38cab888b7d11","comments_url":"https://api.github.com/repos/square/retrofit/commits/bcf07d0dffefb4ca1a33d431f5d38cab888b7d11/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/bcf07d0dffefb4ca1a33d431f5d38cab888b7d11","author":{"date":"2020-04-20T14:06:51.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"committer":{"date":"2020-04-20T14:06:51.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"message":"Remove old buildscript","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/864a7e213cefafacab3f845e37c879e15db36cdc","sha":"864a7e213cefafacab3f845e37c879e15db36cdc"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/88dff564e4e764a56730f1224c3d685e520e2aee","html_url":"https://github.com/square/retrofit/commit/88dff564e4e764a56730f1224c3d685e520e2aee","sha":"88dff564e4e764a56730f1224c3d685e520e2aee"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/88dff564e4e764a56730f1224c3d685e520e2aee","sha":"88dff564e4e764a56730f1224c3d685e520e2aee","node_id":"MDY6Q29tbWl0ODkyMjc1Ojg4ZGZmNTY0ZTRlNzY0YTU2NzMwZjEyMjRjM2Q2ODVlNTIwZTJhZWU=","html_url":"https://github.com/square/retrofit/commit/88dff564e4e764a56730f1224c3d685e520e2aee","comments_url":"https://api.github.com/repos/square/retrofit/commits/88dff564e4e764a56730f1224c3d685e520e2aee/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/88dff564e4e764a56730f1224c3d685e520e2aee","author":{"date":"2020-04-20T13:03:58.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"committer":{"date":"2020-04-20T13:03:58.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"message":"Add Gradle wrapper validation","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/54646f7f42e4259173e1b12eb3c5863d8f33dde7","sha":"54646f7f42e4259173e1b12eb3c5863d8f33dde7"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/ade4f544b2eced866ec07c0ae995801b709e2d8a","html_url":"https://github.com/square/retrofit/commit/ade4f544b2eced866ec07c0ae995801b709e2d8a","sha":"ade4f544b2eced866ec07c0ae995801b709e2d8a"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/ade4f544b2eced866ec07c0ae995801b709e2d8a","sha":"ade4f544b2eced866ec07c0ae995801b709e2d8a","node_id":"MDY6Q29tbWl0ODkyMjc1OmFkZTRmNTQ0YjJlY2VkODY2ZWMwN2MwYWU5OTU4MDFiNzA5ZTJkOGE=","html_url":"https://github.com/square/retrofit/commit/ade4f544b2eced866ec07c0ae995801b709e2d8a","comments_url":"https://api.github.com/repos/square/retrofit/commits/ade4f544b2eced866ec07c0ae995801b709e2d8a/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/ade4f544b2eced866ec07c0ae995801b709e2d8a","author":{"date":"2020-04-20T12:28:44.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"committer":{"date":"2020-04-20T12:28:44.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"message":"Publish script tweaks","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/13fe724becc60940fa57c144545f265607e72924","sha":"13fe724becc60940fa57c144545f265607e72924"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/6ad5751559ff9cbdf8db52c78dff53a4d225c87f","html_url":"https://github.com/square/retrofit/commit/6ad5751559ff9cbdf8db52c78dff53a4d225c87f","sha":"6ad5751559ff9cbdf8db52c78dff53a4d225c87f"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/6ad5751559ff9cbdf8db52c78dff53a4d225c87f","sha":"6ad5751559ff9cbdf8db52c78dff53a4d225c87f","node_id":"MDY6Q29tbWl0ODkyMjc1OjZhZDU3NTE1NTlmZjljYmRmOGRiNTJjNzhkZmY1M2E0ZDIyNWM4N2Y=","html_url":"https://github.com/square/retrofit/commit/6ad5751559ff9cbdf8db52c78dff53a4d225c87f","comments_url":"https://api.github.com/repos/square/retrofit/commits/6ad5751559ff9cbdf8db52c78dff53a4d225c87f/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/6ad5751559ff9cbdf8db52c78dff53a4d225c87f","author":{"date":"2020-04-20T12:14:53.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"committer":{"date":"2020-04-20T12:14:53.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"message":"Add secrets for snapshot deploy","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/a12d27d1b221479fed2f2d80a69943f16b7d00a1","sha":"a12d27d1b221479fed2f2d80a69943f16b7d00a1"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/6db64f2b6120b7ad053face6349ca8f951da3d0f","html_url":"https://github.com/square/retrofit/commit/6db64f2b6120b7ad053face6349ca8f951da3d0f","sha":"6db64f2b6120b7ad053face6349ca8f951da3d0f"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/6db64f2b6120b7ad053face6349ca8f951da3d0f","sha":"6db64f2b6120b7ad053face6349ca8f951da3d0f","node_id":"MDY6Q29tbWl0ODkyMjc1OjZkYjY0ZjJiNjEyMGI3YWQwNTNmYWNlNjM0OWNhOGY5NTFkYTNkMGY=","html_url":"https://github.com/square/retrofit/commit/6db64f2b6120b7ad053face6349ca8f951da3d0f","comments_url":"https://api.github.com/repos/square/retrofit/commits/6db64f2b6120b7ad053face6349ca8f951da3d0f/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/6db64f2b6120b7ad053face6349ca8f951da3d0f","author":{"date":"2020-04-20T11:51:07.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"committer":{"date":"2020-04-20T11:51:09.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"message":"Revert needs format, fix ref to be qualified reference","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/5ce1b62d170d17b2b3d91509eb5678f61ee3a956","sha":"5ce1b62d170d17b2b3d91509eb5678f61ee3a956"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/3cd5de781d88fca380de149641ae6723bcf937ea","html_url":"https://github.com/square/retrofit/commit/3cd5de781d88fca380de149641ae6723bcf937ea","sha":"3cd5de781d88fca380de149641ae6723bcf937ea"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/3cd5de781d88fca380de149641ae6723bcf937ea","sha":"3cd5de781d88fca380de149641ae6723bcf937ea","node_id":"MDY6Q29tbWl0ODkyMjc1OjNjZDVkZTc4MWQ4OGZjYTM4MGRlMTQ5NjQxYWU2NzIzYmNmOTM3ZWE=","html_url":"https://github.com/square/retrofit/commit/3cd5de781d88fca380de149641ae6723bcf937ea","comments_url":"https://api.github.com/repos/square/retrofit/commits/3cd5de781d88fca380de149641ae6723bcf937ea/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/3cd5de781d88fca380de149641ae6723bcf937ea","author":{"date":"2020-04-20T11:45:08.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"committer":{"date":"2020-04-20T11:45:08.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"message":"Use array for needs","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/d397d861dfaa4692178d4620f9563f1a3b1d497d","sha":"d397d861dfaa4692178d4620f9563f1a3b1d497d"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/a3899f234e7b71fa49ff4a016c7826c59b6d6979","html_url":"https://github.com/square/retrofit/commit/a3899f234e7b71fa49ff4a016c7826c59b6d6979","sha":"a3899f234e7b71fa49ff4a016c7826c59b6d6979"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/a3899f234e7b71fa49ff4a016c7826c59b6d6979","sha":"a3899f234e7b71fa49ff4a016c7826c59b6d6979","node_id":"MDY6Q29tbWl0ODkyMjc1OmEzODk5ZjIzNGU3YjcxZmE0OWZmNGEwMTZjNzgyNmM1OWI2ZDY5Nzk=","html_url":"https://github.com/square/retrofit/commit/a3899f234e7b71fa49ff4a016c7826c59b6d6979","comments_url":"https://api.github.com/repos/square/retrofit/commits/a3899f234e7b71fa49ff4a016c7826c59b6d6979/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/a3899f234e7b71fa49ff4a016c7826c59b6d6979","author":{"date":"2020-04-20T11:26:36.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"committer":{"date":"2020-04-20T11:26:36.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"message":"Fix build conditional","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/345e8b4e1e52e418a834a474191556fb0f2c7483","sha":"345e8b4e1e52e418a834a474191556fb0f2c7483"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/63cf3e66c4b661170a34a396e9be8a2a01c0e57f","html_url":"https://github.com/square/retrofit/commit/63cf3e66c4b661170a34a396e9be8a2a01c0e57f","sha":"63cf3e66c4b661170a34a396e9be8a2a01c0e57f"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/8160ec251a3b50b7ab6bb6b3ad84885a7bcc8794","sha":"8160ec251a3b50b7ab6bb6b3ad84885a7bcc8794","node_id":"MDY6Q29tbWl0ODkyMjc1OjgxNjBlYzI1MWEzYjUwYjdhYjZiYjZiM2FkODQ4ODVhN2JjYzg3OTQ=","html_url":"https://github.com/square/retrofit/commit/8160ec251a3b50b7ab6bb6b3ad84885a7bcc8794","comments_url":"https://api.github.com/repos/square/retrofit/commits/8160ec251a3b50b7ab6bb6b3ad84885a7bcc8794/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/8160ec251a3b50b7ab6bb6b3ad84885a7bcc8794","author":{"date":"2020-04-20T10:13:28.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"committer":{"date":"2020-04-20T10:13:28.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"message":"Switch to GitHub Actions","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/14f768fe786432966eb7602d123d908005a5cef4","sha":"14f768fe786432966eb7602d123d908005a5cef4"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/108fe23964b986107aed352ba467cd2007d15208","html_url":"https://github.com/square/retrofit/commit/108fe23964b986107aed352ba467cd2007d15208","sha":"108fe23964b986107aed352ba467cd2007d15208"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/34f6a7fdc2f359d05a32f3262825563fc10929b4","sha":"34f6a7fdc2f359d05a32f3262825563fc10929b4","node_id":"MDY6Q29tbWl0ODkyMjc1OjM0ZjZhN2ZkYzJmMzU5ZDA1YTMyZjMyNjI4MjU1NjNmYzEwOTI5YjQ=","html_url":"https://github.com/square/retrofit/commit/34f6a7fdc2f359d05a32f3262825563fc10929b4","comments_url":"https://api.github.com/repos/square/retrofit/commits/34f6a7fdc2f359d05a32f3262825563fc10929b4/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/34f6a7fdc2f359d05a32f3262825563fc10929b4","author":{"date":"2020-04-17T22:43:23.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"committer":{"date":"2020-04-20T10:46:25.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"message":"Add Android integration tests","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/4b112f77ec410e4728ec9df23c92e0c99d864fa4","sha":"4b112f77ec410e4728ec9df23c92e0c99d864fa4"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/084087f2ec8eb411eb25c741c73cb1a7fafa024f","html_url":"https://github.com/square/retrofit/commit/084087f2ec8eb411eb25c741c73cb1a7fafa024f","sha":"084087f2ec8eb411eb25c741c73cb1a7fafa024f"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1},{"url":"https://api.github.com/repos/square/retrofit/commits/ee71a6858dfddcc4650f6ff4d71112911bdf6ca7","sha":"ee71a6858dfddcc4650f6ff4d71112911bdf6ca7","node_id":"MDY6Q29tbWl0ODkyMjc1OmVlNzFhNjg1OGRmZGRjYzQ2NTBmNmZmNGQ3MTExMjkxMWJkZjZjYTc=","html_url":"https://github.com/square/retrofit/commit/ee71a6858dfddcc4650f6ff4d71112911bdf6ca7","comments_url":"https://api.github.com/repos/square/retrofit/commits/ee71a6858dfddcc4650f6ff4d71112911bdf6ca7/comments","commit":{"url":"https://api.github.com/repos/square/retrofit/git/commits/ee71a6858dfddcc4650f6ff4d71112911bdf6ca7","author":{"date":"2020-04-17T13:27:42.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"committer":{"date":"2020-04-17T13:27:42.000-04:00","name":"Jake Wharton","email":"jakew@google.com"},"message":"Add google-java-format and reformat","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/1e4189d2f352b7fb2d3b5bea21b682431fffdaec","sha":"1e4189d2f352b7fb2d3b5bea21b682431fffdaec"},"comment_count":0},"author":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"committer":{"login":"JakeWharton","id":66577,"node_id":"MDQ6VXNlcjY2NTc3","avatar_url":"https://avatars.githubusercontent.com/u/66577?v=4","gravatar_id":"","url":"https://api.github.com/users/JakeWharton","html_url":"https://github.com/JakeWharton","followers_url":"https://api.github.com/users/JakeWharton/followers","following_url":"https://api.github.com/users/JakeWharton/following{/other_user}","gists_url":"https://api.github.com/users/JakeWharton/gists{/gist_id}","starred_url":"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/JakeWharton/subscriptions","organizations_url":"https://api.github.com/users/JakeWharton/orgs","repos_url":"https://api.github.com/users/JakeWharton/repos","events_url":"https://api.github.com/users/JakeWharton/events{/privacy}","received_events_url":"https://api.github.com/users/JakeWharton/received_events","type":"User","site_admin":false},"parents":[{"url":"https://api.github.com/repos/square/retrofit/commits/9ebfa3a4b473d7547f8e58cf058f0b9f860e98b4","html_url":"https://github.com/square/retrofit/commit/9ebfa3a4b473d7547f8e58cf058f0b9f860e98b4","sha":"9ebfa3a4b473d7547f8e58cf058f0b9f860e98b4"}],"repository":{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"},"score":1}]
     */

    private int total_count;
    private boolean incomplete_results;
    private List<ItemsBean> items;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public boolean isIncomplete_results() {
        return incomplete_results;
    }

    public void setIncomplete_results(boolean incomplete_results) {
        this.incomplete_results = incomplete_results;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        /**
         * url : https://api.github.com/repos/square/retrofit/commits/49e84530614cbd0fe2070f484754305b0c032e71
         * sha : 49e84530614cbd0fe2070f484754305b0c032e71
         * node_id : MDY6Q29tbWl0ODkyMjc1OjQ5ZTg0NTMwNjE0Y2JkMGZlMjA3MGY0ODQ3NTQzMDViMGMwMzJlNzE=
         * html_url : https://github.com/square/retrofit/commit/49e84530614cbd0fe2070f484754305b0c032e71
         * comments_url : https://api.github.com/repos/square/retrofit/commits/49e84530614cbd0fe2070f484754305b0c032e71/comments
         * commit : {"url":"https://api.github.com/repos/square/retrofit/git/commits/49e84530614cbd0fe2070f484754305b0c032e71","author":{"date":"2021-02-09T09:55:49.000-06:00","name":"John Carlson","email":"jawnnypoo@gmail.com"},"committer":{"date":"2021-02-09T09:55:49.000-06:00","name":"GitHub","email":"noreply@github.com"},"message":"Fix broken r8/proguard link for OkHttp\n\nThe link was just taking you to the top of the OkHttp page instead of the R8/ProGuard section","tree":{"url":"https://api.github.com/repos/square/retrofit/git/trees/e71842a58ac79a5d3ef00a14d9917e6f077036a7","sha":"e71842a58ac79a5d3ef00a14d9917e6f077036a7"},"comment_count":0}
         * author : {"login":"Jawnnypoo","id":1459320,"node_id":"MDQ6VXNlcjE0NTkzMjA=","avatar_url":"https://avatars.githubusercontent.com/u/1459320?v=4","gravatar_id":"","url":"https://api.github.com/users/Jawnnypoo","html_url":"https://github.com/Jawnnypoo","followers_url":"https://api.github.com/users/Jawnnypoo/followers","following_url":"https://api.github.com/users/Jawnnypoo/following{/other_user}","gists_url":"https://api.github.com/users/Jawnnypoo/gists{/gist_id}","starred_url":"https://api.github.com/users/Jawnnypoo/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Jawnnypoo/subscriptions","organizations_url":"https://api.github.com/users/Jawnnypoo/orgs","repos_url":"https://api.github.com/users/Jawnnypoo/repos","events_url":"https://api.github.com/users/Jawnnypoo/events{/privacy}","received_events_url":"https://api.github.com/users/Jawnnypoo/received_events","type":"User","site_admin":false}
         * committer : {"login":"web-flow","id":19864447,"node_id":"MDQ6VXNlcjE5ODY0NDQ3","avatar_url":"https://avatars.githubusercontent.com/u/19864447?v=4","gravatar_id":"","url":"https://api.github.com/users/web-flow","html_url":"https://github.com/web-flow","followers_url":"https://api.github.com/users/web-flow/followers","following_url":"https://api.github.com/users/web-flow/following{/other_user}","gists_url":"https://api.github.com/users/web-flow/gists{/gist_id}","starred_url":"https://api.github.com/users/web-flow/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/web-flow/subscriptions","organizations_url":"https://api.github.com/users/web-flow/orgs","repos_url":"https://api.github.com/users/web-flow/repos","events_url":"https://api.github.com/users/web-flow/events{/privacy}","received_events_url":"https://api.github.com/users/web-flow/received_events","type":"User","site_admin":false}
         * parents : [{"url":"https://api.github.com/repos/square/retrofit/commits/2583d360fa39792f87faf7f69afefaadf3944536","html_url":"https://github.com/square/retrofit/commit/2583d360fa39792f87faf7f69afefaadf3944536","sha":"2583d360fa39792f87faf7f69afefaadf3944536"}]
         * repository : {"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"A type-safe HTTP client for Android and the JVM","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments"}
         * score : 1
         */

        private String url;
        private String sha;
        private String node_id;
        private String html_url;
        private String comments_url;
        private CommitBean commit;
        private AuthorBeanX author;
        private CommitterBeanX committer;
        private RepositoryBean repository;
        private int score;
        private List<ParentsBean> parents;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSha() {
            return sha;
        }

        public void setSha(String sha) {
            this.sha = sha;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getComments_url() {
            return comments_url;
        }

        public void setComments_url(String comments_url) {
            this.comments_url = comments_url;
        }

        public CommitBean getCommit() {
            return commit;
        }

        public void setCommit(CommitBean commit) {
            this.commit = commit;
        }

        public AuthorBeanX getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBeanX author) {
            this.author = author;
        }

        public CommitterBeanX getCommitter() {
            return committer;
        }

        public void setCommitter(CommitterBeanX committer) {
            this.committer = committer;
        }

        public RepositoryBean getRepository() {
            return repository;
        }

        public void setRepository(RepositoryBean repository) {
            this.repository = repository;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public List<ParentsBean> getParents() {
            return parents;
        }

        public void setParents(List<ParentsBean> parents) {
            this.parents = parents;
        }

        public static class CommitBean {
            /**
             * url : https://api.github.com/repos/square/retrofit/git/commits/49e84530614cbd0fe2070f484754305b0c032e71
             * author : {"date":"2021-02-09T09:55:49.000-06:00","name":"John Carlson","email":"jawnnypoo@gmail.com"}
             * committer : {"date":"2021-02-09T09:55:49.000-06:00","name":"GitHub","email":"noreply@github.com"}
             * message : Fix broken r8/proguard link for OkHttp

             The link was just taking you to the top of the OkHttp page instead of the R8/ProGuard section
             * tree : {"url":"https://api.github.com/repos/square/retrofit/git/trees/e71842a58ac79a5d3ef00a14d9917e6f077036a7","sha":"e71842a58ac79a5d3ef00a14d9917e6f077036a7"}
             * comment_count : 0
             */

            private String url;
            private AuthorBean author;
            private CommitterBean committer;
            private String message;
            private TreeBean tree;
            private int comment_count;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public CommitterBean getCommitter() {
                return committer;
            }

            public void setCommitter(CommitterBean committer) {
                this.committer = committer;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public TreeBean getTree() {
                return tree;
            }

            public void setTree(TreeBean tree) {
                this.tree = tree;
            }

            public int getComment_count() {
                return comment_count;
            }

            public void setComment_count(int comment_count) {
                this.comment_count = comment_count;
            }

            public static class AuthorBean {
                /**
                 * date : 2021-02-09T09:55:49.000-06:00
                 * name : John Carlson
                 * email : jawnnypoo@gmail.com
                 */

                private String date;
                private String name;
                private String email;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }
            }

            public static class CommitterBean {
                /**
                 * date : 2021-02-09T09:55:49.000-06:00
                 * name : GitHub
                 * email : noreply@github.com
                 */

                private String date;
                private String name;
                private String email;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }
            }

            public static class TreeBean {
                /**
                 * url : https://api.github.com/repos/square/retrofit/git/trees/e71842a58ac79a5d3ef00a14d9917e6f077036a7
                 * sha : e71842a58ac79a5d3ef00a14d9917e6f077036a7
                 */

                private String url;
                private String sha;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getSha() {
                    return sha;
                }

                public void setSha(String sha) {
                    this.sha = sha;
                }
            }
        }

        public static class AuthorBeanX {
            /**
             * login : Jawnnypoo
             * id : 1459320
             * node_id : MDQ6VXNlcjE0NTkzMjA=
             * avatar_url : https://avatars.githubusercontent.com/u/1459320?v=4
             * gravatar_id :
             * url : https://api.github.com/users/Jawnnypoo
             * html_url : https://github.com/Jawnnypoo
             * followers_url : https://api.github.com/users/Jawnnypoo/followers
             * following_url : https://api.github.com/users/Jawnnypoo/following{/other_user}
             * gists_url : https://api.github.com/users/Jawnnypoo/gists{/gist_id}
             * starred_url : https://api.github.com/users/Jawnnypoo/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/Jawnnypoo/subscriptions
             * organizations_url : https://api.github.com/users/Jawnnypoo/orgs
             * repos_url : https://api.github.com/users/Jawnnypoo/repos
             * events_url : https://api.github.com/users/Jawnnypoo/events{/privacy}
             * received_events_url : https://api.github.com/users/Jawnnypoo/received_events
             * type : User
             * site_admin : false
             */

            private String login;
            private int id;
            private String node_id;
            private String avatar_url;
            private String gravatar_id;
            private String url;
            private String html_url;
            private String followers_url;
            private String following_url;
            private String gists_url;
            private String starred_url;
            private String subscriptions_url;
            private String organizations_url;
            private String repos_url;
            private String events_url;
            private String received_events_url;
            private String type;
            private boolean site_admin;

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getGravatar_id() {
                return gravatar_id;
            }

            public void setGravatar_id(String gravatar_id) {
                this.gravatar_id = gravatar_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getFollowers_url() {
                return followers_url;
            }

            public void setFollowers_url(String followers_url) {
                this.followers_url = followers_url;
            }

            public String getFollowing_url() {
                return following_url;
            }

            public void setFollowing_url(String following_url) {
                this.following_url = following_url;
            }

            public String getGists_url() {
                return gists_url;
            }

            public void setGists_url(String gists_url) {
                this.gists_url = gists_url;
            }

            public String getStarred_url() {
                return starred_url;
            }

            public void setStarred_url(String starred_url) {
                this.starred_url = starred_url;
            }

            public String getSubscriptions_url() {
                return subscriptions_url;
            }

            public void setSubscriptions_url(String subscriptions_url) {
                this.subscriptions_url = subscriptions_url;
            }

            public String getOrganizations_url() {
                return organizations_url;
            }

            public void setOrganizations_url(String organizations_url) {
                this.organizations_url = organizations_url;
            }

            public String getRepos_url() {
                return repos_url;
            }

            public void setRepos_url(String repos_url) {
                this.repos_url = repos_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getReceived_events_url() {
                return received_events_url;
            }

            public void setReceived_events_url(String received_events_url) {
                this.received_events_url = received_events_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public boolean isSite_admin() {
                return site_admin;
            }

            public void setSite_admin(boolean site_admin) {
                this.site_admin = site_admin;
            }
        }

        public static class CommitterBeanX {
            /**
             * login : web-flow
             * id : 19864447
             * node_id : MDQ6VXNlcjE5ODY0NDQ3
             * avatar_url : https://avatars.githubusercontent.com/u/19864447?v=4
             * gravatar_id :
             * url : https://api.github.com/users/web-flow
             * html_url : https://github.com/web-flow
             * followers_url : https://api.github.com/users/web-flow/followers
             * following_url : https://api.github.com/users/web-flow/following{/other_user}
             * gists_url : https://api.github.com/users/web-flow/gists{/gist_id}
             * starred_url : https://api.github.com/users/web-flow/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/web-flow/subscriptions
             * organizations_url : https://api.github.com/users/web-flow/orgs
             * repos_url : https://api.github.com/users/web-flow/repos
             * events_url : https://api.github.com/users/web-flow/events{/privacy}
             * received_events_url : https://api.github.com/users/web-flow/received_events
             * type : User
             * site_admin : false
             */

            private String login;
            private int id;
            private String node_id;
            private String avatar_url;
            private String gravatar_id;
            private String url;
            private String html_url;
            private String followers_url;
            private String following_url;
            private String gists_url;
            private String starred_url;
            private String subscriptions_url;
            private String organizations_url;
            private String repos_url;
            private String events_url;
            private String received_events_url;
            private String type;
            private boolean site_admin;

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getGravatar_id() {
                return gravatar_id;
            }

            public void setGravatar_id(String gravatar_id) {
                this.gravatar_id = gravatar_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getFollowers_url() {
                return followers_url;
            }

            public void setFollowers_url(String followers_url) {
                this.followers_url = followers_url;
            }

            public String getFollowing_url() {
                return following_url;
            }

            public void setFollowing_url(String following_url) {
                this.following_url = following_url;
            }

            public String getGists_url() {
                return gists_url;
            }

            public void setGists_url(String gists_url) {
                this.gists_url = gists_url;
            }

            public String getStarred_url() {
                return starred_url;
            }

            public void setStarred_url(String starred_url) {
                this.starred_url = starred_url;
            }

            public String getSubscriptions_url() {
                return subscriptions_url;
            }

            public void setSubscriptions_url(String subscriptions_url) {
                this.subscriptions_url = subscriptions_url;
            }

            public String getOrganizations_url() {
                return organizations_url;
            }

            public void setOrganizations_url(String organizations_url) {
                this.organizations_url = organizations_url;
            }

            public String getRepos_url() {
                return repos_url;
            }

            public void setRepos_url(String repos_url) {
                this.repos_url = repos_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getReceived_events_url() {
                return received_events_url;
            }

            public void setReceived_events_url(String received_events_url) {
                this.received_events_url = received_events_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public boolean isSite_admin() {
                return site_admin;
            }

            public void setSite_admin(boolean site_admin) {
                this.site_admin = site_admin;
            }
        }

        public static class RepositoryBean {
            /**
             * id : 892275
             * node_id : MDEwOlJlcG9zaXRvcnk4OTIyNzU=
             * name : retrofit
             * full_name : square/retrofit
             * private : false
             * owner : {"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false}
             * html_url : https://github.com/square/retrofit
             * description : A type-safe HTTP client for Android and the JVM
             * fork : false
             * url : https://api.github.com/repos/square/retrofit
             * forks_url : https://api.github.com/repos/square/retrofit/forks
             * keys_url : https://api.github.com/repos/square/retrofit/keys{/key_id}
             * collaborators_url : https://api.github.com/repos/square/retrofit/collaborators{/collaborator}
             * teams_url : https://api.github.com/repos/square/retrofit/teams
             * hooks_url : https://api.github.com/repos/square/retrofit/hooks
             * issue_events_url : https://api.github.com/repos/square/retrofit/issues/events{/number}
             * events_url : https://api.github.com/repos/square/retrofit/events
             * assignees_url : https://api.github.com/repos/square/retrofit/assignees{/user}
             * branches_url : https://api.github.com/repos/square/retrofit/branches{/branch}
             * tags_url : https://api.github.com/repos/square/retrofit/tags
             * blobs_url : https://api.github.com/repos/square/retrofit/git/blobs{/sha}
             * git_tags_url : https://api.github.com/repos/square/retrofit/git/tags{/sha}
             * git_refs_url : https://api.github.com/repos/square/retrofit/git/refs{/sha}
             * trees_url : https://api.github.com/repos/square/retrofit/git/trees{/sha}
             * statuses_url : https://api.github.com/repos/square/retrofit/statuses/{sha}
             * languages_url : https://api.github.com/repos/square/retrofit/languages
             * stargazers_url : https://api.github.com/repos/square/retrofit/stargazers
             * contributors_url : https://api.github.com/repos/square/retrofit/contributors
             * subscribers_url : https://api.github.com/repos/square/retrofit/subscribers
             * subscription_url : https://api.github.com/repos/square/retrofit/subscription
             * commits_url : https://api.github.com/repos/square/retrofit/commits{/sha}
             * git_commits_url : https://api.github.com/repos/square/retrofit/git/commits{/sha}
             * comments_url : https://api.github.com/repos/square/retrofit/comments{/number}
             * issue_comment_url : https://api.github.com/repos/square/retrofit/issues/comments{/number}
             * contents_url : https://api.github.com/repos/square/retrofit/contents/{+path}
             * compare_url : https://api.github.com/repos/square/retrofit/compare/{base}...{head}
             * merges_url : https://api.github.com/repos/square/retrofit/merges
             * archive_url : https://api.github.com/repos/square/retrofit/{archive_format}{/ref}
             * downloads_url : https://api.github.com/repos/square/retrofit/downloads
             * issues_url : https://api.github.com/repos/square/retrofit/issues{/number}
             * pulls_url : https://api.github.com/repos/square/retrofit/pulls{/number}
             * milestones_url : https://api.github.com/repos/square/retrofit/milestones{/number}
             * notifications_url : https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}
             * labels_url : https://api.github.com/repos/square/retrofit/labels{/name}
             * releases_url : https://api.github.com/repos/square/retrofit/releases{/id}
             * deployments_url : https://api.github.com/repos/square/retrofit/deployments
             */

            private int id;
            private String node_id;
            private String name;
            private String full_name;
            @SerializedName("private")
            private boolean privateX;
            private OwnerBean owner;
            private String html_url;
            private String description;
            private boolean fork;
            private String url;
            private String forks_url;
            private String keys_url;
            private String collaborators_url;
            private String teams_url;
            private String hooks_url;
            private String issue_events_url;
            private String events_url;
            private String assignees_url;
            private String branches_url;
            private String tags_url;
            private String blobs_url;
            private String git_tags_url;
            private String git_refs_url;
            private String trees_url;
            private String statuses_url;
            private String languages_url;
            private String stargazers_url;
            private String contributors_url;
            private String subscribers_url;
            private String subscription_url;
            private String commits_url;
            private String git_commits_url;
            private String comments_url;
            private String issue_comment_url;
            private String contents_url;
            private String compare_url;
            private String merges_url;
            private String archive_url;
            private String downloads_url;
            private String issues_url;
            private String pulls_url;
            private String milestones_url;
            private String notifications_url;
            private String labels_url;
            private String releases_url;
            private String deployments_url;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public boolean isPrivateX() {
                return privateX;
            }

            public void setPrivateX(boolean privateX) {
                this.privateX = privateX;
            }

            public OwnerBean getOwner() {
                return owner;
            }

            public void setOwner(OwnerBean owner) {
                this.owner = owner;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public boolean isFork() {
                return fork;
            }

            public void setFork(boolean fork) {
                this.fork = fork;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getForks_url() {
                return forks_url;
            }

            public void setForks_url(String forks_url) {
                this.forks_url = forks_url;
            }

            public String getKeys_url() {
                return keys_url;
            }

            public void setKeys_url(String keys_url) {
                this.keys_url = keys_url;
            }

            public String getCollaborators_url() {
                return collaborators_url;
            }

            public void setCollaborators_url(String collaborators_url) {
                this.collaborators_url = collaborators_url;
            }

            public String getTeams_url() {
                return teams_url;
            }

            public void setTeams_url(String teams_url) {
                this.teams_url = teams_url;
            }

            public String getHooks_url() {
                return hooks_url;
            }

            public void setHooks_url(String hooks_url) {
                this.hooks_url = hooks_url;
            }

            public String getIssue_events_url() {
                return issue_events_url;
            }

            public void setIssue_events_url(String issue_events_url) {
                this.issue_events_url = issue_events_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getAssignees_url() {
                return assignees_url;
            }

            public void setAssignees_url(String assignees_url) {
                this.assignees_url = assignees_url;
            }

            public String getBranches_url() {
                return branches_url;
            }

            public void setBranches_url(String branches_url) {
                this.branches_url = branches_url;
            }

            public String getTags_url() {
                return tags_url;
            }

            public void setTags_url(String tags_url) {
                this.tags_url = tags_url;
            }

            public String getBlobs_url() {
                return blobs_url;
            }

            public void setBlobs_url(String blobs_url) {
                this.blobs_url = blobs_url;
            }

            public String getGit_tags_url() {
                return git_tags_url;
            }

            public void setGit_tags_url(String git_tags_url) {
                this.git_tags_url = git_tags_url;
            }

            public String getGit_refs_url() {
                return git_refs_url;
            }

            public void setGit_refs_url(String git_refs_url) {
                this.git_refs_url = git_refs_url;
            }

            public String getTrees_url() {
                return trees_url;
            }

            public void setTrees_url(String trees_url) {
                this.trees_url = trees_url;
            }

            public String getStatuses_url() {
                return statuses_url;
            }

            public void setStatuses_url(String statuses_url) {
                this.statuses_url = statuses_url;
            }

            public String getLanguages_url() {
                return languages_url;
            }

            public void setLanguages_url(String languages_url) {
                this.languages_url = languages_url;
            }

            public String getStargazers_url() {
                return stargazers_url;
            }

            public void setStargazers_url(String stargazers_url) {
                this.stargazers_url = stargazers_url;
            }

            public String getContributors_url() {
                return contributors_url;
            }

            public void setContributors_url(String contributors_url) {
                this.contributors_url = contributors_url;
            }

            public String getSubscribers_url() {
                return subscribers_url;
            }

            public void setSubscribers_url(String subscribers_url) {
                this.subscribers_url = subscribers_url;
            }

            public String getSubscription_url() {
                return subscription_url;
            }

            public void setSubscription_url(String subscription_url) {
                this.subscription_url = subscription_url;
            }

            public String getCommits_url() {
                return commits_url;
            }

            public void setCommits_url(String commits_url) {
                this.commits_url = commits_url;
            }

            public String getGit_commits_url() {
                return git_commits_url;
            }

            public void setGit_commits_url(String git_commits_url) {
                this.git_commits_url = git_commits_url;
            }

            public String getComments_url() {
                return comments_url;
            }

            public void setComments_url(String comments_url) {
                this.comments_url = comments_url;
            }

            public String getIssue_comment_url() {
                return issue_comment_url;
            }

            public void setIssue_comment_url(String issue_comment_url) {
                this.issue_comment_url = issue_comment_url;
            }

            public String getContents_url() {
                return contents_url;
            }

            public void setContents_url(String contents_url) {
                this.contents_url = contents_url;
            }

            public String getCompare_url() {
                return compare_url;
            }

            public void setCompare_url(String compare_url) {
                this.compare_url = compare_url;
            }

            public String getMerges_url() {
                return merges_url;
            }

            public void setMerges_url(String merges_url) {
                this.merges_url = merges_url;
            }

            public String getArchive_url() {
                return archive_url;
            }

            public void setArchive_url(String archive_url) {
                this.archive_url = archive_url;
            }

            public String getDownloads_url() {
                return downloads_url;
            }

            public void setDownloads_url(String downloads_url) {
                this.downloads_url = downloads_url;
            }

            public String getIssues_url() {
                return issues_url;
            }

            public void setIssues_url(String issues_url) {
                this.issues_url = issues_url;
            }

            public String getPulls_url() {
                return pulls_url;
            }

            public void setPulls_url(String pulls_url) {
                this.pulls_url = pulls_url;
            }

            public String getMilestones_url() {
                return milestones_url;
            }

            public void setMilestones_url(String milestones_url) {
                this.milestones_url = milestones_url;
            }

            public String getNotifications_url() {
                return notifications_url;
            }

            public void setNotifications_url(String notifications_url) {
                this.notifications_url = notifications_url;
            }

            public String getLabels_url() {
                return labels_url;
            }

            public void setLabels_url(String labels_url) {
                this.labels_url = labels_url;
            }

            public String getReleases_url() {
                return releases_url;
            }

            public void setReleases_url(String releases_url) {
                this.releases_url = releases_url;
            }

            public String getDeployments_url() {
                return deployments_url;
            }

            public void setDeployments_url(String deployments_url) {
                this.deployments_url = deployments_url;
            }

            public static class OwnerBean {
                /**
                 * login : square
                 * id : 82592
                 * node_id : MDEyOk9yZ2FuaXphdGlvbjgyNTky
                 * avatar_url : https://avatars.githubusercontent.com/u/82592?v=4
                 * gravatar_id :
                 * url : https://api.github.com/users/square
                 * html_url : https://github.com/square
                 * followers_url : https://api.github.com/users/square/followers
                 * following_url : https://api.github.com/users/square/following{/other_user}
                 * gists_url : https://api.github.com/users/square/gists{/gist_id}
                 * starred_url : https://api.github.com/users/square/starred{/owner}{/repo}
                 * subscriptions_url : https://api.github.com/users/square/subscriptions
                 * organizations_url : https://api.github.com/users/square/orgs
                 * repos_url : https://api.github.com/users/square/repos
                 * events_url : https://api.github.com/users/square/events{/privacy}
                 * received_events_url : https://api.github.com/users/square/received_events
                 * type : Organization
                 * site_admin : false
                 */

                private String login;
                private int id;
                private String node_id;
                private String avatar_url;
                private String gravatar_id;
                private String url;
                private String html_url;
                private String followers_url;
                private String following_url;
                private String gists_url;
                private String starred_url;
                private String subscriptions_url;
                private String organizations_url;
                private String repos_url;
                private String events_url;
                private String received_events_url;
                private String type;
                private boolean site_admin;

                public String getLogin() {
                    return login;
                }

                public void setLogin(String login) {
                    this.login = login;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getNode_id() {
                    return node_id;
                }

                public void setNode_id(String node_id) {
                    this.node_id = node_id;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public String getGravatar_id() {
                    return gravatar_id;
                }

                public void setGravatar_id(String gravatar_id) {
                    this.gravatar_id = gravatar_id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHtml_url() {
                    return html_url;
                }

                public void setHtml_url(String html_url) {
                    this.html_url = html_url;
                }

                public String getFollowers_url() {
                    return followers_url;
                }

                public void setFollowers_url(String followers_url) {
                    this.followers_url = followers_url;
                }

                public String getFollowing_url() {
                    return following_url;
                }

                public void setFollowing_url(String following_url) {
                    this.following_url = following_url;
                }

                public String getGists_url() {
                    return gists_url;
                }

                public void setGists_url(String gists_url) {
                    this.gists_url = gists_url;
                }

                public String getStarred_url() {
                    return starred_url;
                }

                public void setStarred_url(String starred_url) {
                    this.starred_url = starred_url;
                }

                public String getSubscriptions_url() {
                    return subscriptions_url;
                }

                public void setSubscriptions_url(String subscriptions_url) {
                    this.subscriptions_url = subscriptions_url;
                }

                public String getOrganizations_url() {
                    return organizations_url;
                }

                public void setOrganizations_url(String organizations_url) {
                    this.organizations_url = organizations_url;
                }

                public String getRepos_url() {
                    return repos_url;
                }

                public void setRepos_url(String repos_url) {
                    this.repos_url = repos_url;
                }

                public String getEvents_url() {
                    return events_url;
                }

                public void setEvents_url(String events_url) {
                    this.events_url = events_url;
                }

                public String getReceived_events_url() {
                    return received_events_url;
                }

                public void setReceived_events_url(String received_events_url) {
                    this.received_events_url = received_events_url;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public boolean isSite_admin() {
                    return site_admin;
                }

                public void setSite_admin(boolean site_admin) {
                    this.site_admin = site_admin;
                }
            }
        }

        public static class ParentsBean {
            /**
             * url : https://api.github.com/repos/square/retrofit/commits/2583d360fa39792f87faf7f69afefaadf3944536
             * html_url : https://github.com/square/retrofit/commit/2583d360fa39792f87faf7f69afefaadf3944536
             * sha : 2583d360fa39792f87faf7f69afefaadf3944536
             */

            private String url;
            private String html_url;
            private String sha;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getSha() {
                return sha;
            }

            public void setSha(String sha) {
                this.sha = sha;
            }
        }
    }
}
